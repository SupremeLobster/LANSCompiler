/*
 * Carla Davesa, Martí Mas. (C) 2022. All rights reserved.
 */

grammar LANSGrammar;

@header{
    import java.io.*;
    import java.util.Vector;
}

@parser::members{
     SymTable<Registre> TS = new SymTable<Registre>(1000);
     Bytecode BC = new Bytecode("ResultatsFitxerCompilat");

     boolean error = false;
     Long nVars = 0L;

     //override method
     public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e){
          super.notifyErrorListeners(offendingToken,msg,e);
          error=true;
     }
}

// Regles sintàctiques i semàntiques
inici
    @init {
        System.out.println("Inici de compilació");
        Vector<Long> trad = new Vector<Long>();
    }
    @after {
        trad.add(BC.RETURN);
        BC.addMainCode(1000L,1000L,trad);
        BC.write();
        System.out.println("Fi de compilació");
    }
    :
    dec_constants?
    dec_tipus?
    dec_acc_func?
    prog = programa {
            trad.addAll($prog.trad);
    }
    imp_acc_func?
    EOF;

// Programa
programa returns [Vector<Long> trad]
    @init {
        System.out.println("Inici de programa");
        $trad = new Vector<Long>(10);
    }
    @after {
        System.out.println("Fi de programa");
    }
    : TK_PC_PROGRAMA  TK_IDENT dec_variables? (n=sentencia {
        $trad.addAll($n.trad);
    })+ TK_PC_FPROGRAMA;

// Bloc Constants
dec_constants returns [Vector<Long> trad]
    @init {
        System.out.println("Inici del bloc de constants");
        $trad = new Vector<Long>(10);
    }: TK_PC_CONSTANTS  a=assign_constant+ {
        if (!error) $trad = $a.trad;
    } TK_PC_FCONSTANTS {
        System.out.println("Fi del bloc de constants");
    };

    // falta acabar
assign_constant returns [Vector<Long> trad]
    @init {
        $trad = new Vector<Long>(10);
    }: tipus=TK_TIPUS nom=TK_IDENT TK_ASSIGN_VALUE valor=valor_constant {
        if (TS.existeix($nom.text)) {
            notifyErrorListeners("Error! La constant " + $nom.text + " ja existeix.");
        }
        else {
            Long adreca = bytecode.addConstantName($nom.text, $tipus.text, $valor.text);
            TS.inserir(scope, $nom.text, Registre.CrearRegistreConstant($nom.text, $tipus.text, adreca))
        };
    } TK_SEMI;

// Bloc Vector
vector: TK_PC_VECTOR  tipus_basics  TK_PC_MIDA  TK_ENTER ( TK_PC_INICI_INDEX  TK_ENTER)? ;

// Bloc Tupla
tupla: TK_PC_TUPLA  (id=TK_IDENT  TK_COLON  tb=tipus_basics {
        Registre camp = new Registre($id.text,"TUPLE",$tb.type);
        TS.inserir($id.text,camp);
        System.out.println("Afegit un camp de tupla amb lexema " + $id.text);
    }TK_SEMI )+ TK_PC_FTUPLA ;


// Bloc Tipus
dec_tipus
    @init{
        System.out.println("Inici bloc de tipus");
    }
    @after{
        System.out.println("Fi bloc de tipus");
    }: TK_PC_TIPUS  (declaracio_tipus_nou)+ TK_PC_FTIPUS;

declaracio_tipus_nou : id=TK_IDENT {
        if(TS.existeix($id.text)){
            error = true;
            System.err.println("Error semàntic: ja existeix el id amb lexema " + $id.text + ". Linia " + $id.line + ":" + $id.pos);
            System.exit(-1);
        }
    } TK_COLON  (vector {
        Registre nouTipusVec = new Registre($id.text,ConstantsTipus.VECTOR,ConstantsTipus.TIPUSNOU);
        TS.inserir($id.text,nouTipusVec);
        System.out.println("Afegit un nou tipus VECTOR amb lexema " + $id.text);
    } | tupla {
        Registre nouTipusTuple = new Registre($id.text,ConstantsTipus.TUPLE,ConstantsTipus.TIPUSNOU);
        TS.inserir($id.text,nouTipusTuple);
        System.out.println("Afegit un nou tipus TUPLA amb lexema " + $id.text);
    }) TK_SEMI;

params_formals_ent : (TK_PC_ENT?  TK_IDENT  TK_COLON  (TK_TIPUS | TK_IDENT) (TK_COMMA  TK_PC_ENT?  TK_IDENT  TK_COLON  (TK_TIPUS | TK_IDENT))*)+;
params_formals_ent_entsor : ((TK_PC_ENT | TK_PC_ENTSOR)?  TK_IDENT  TK_COLON  (TK_TIPUS | TK_IDENT) (TK_COMMA  (TK_PC_ENT | TK_PC_ENTSOR)?  TK_IDENT  TK_COLON  (TK_TIPUS | TK_IDENT))*)+ ;
dec_accio : TK_PC_ACCIO  TK_IDENT TK_LPAREN params_formals_ent_entsor? TK_RPAREN TK_SEMI ;
dec_funcio : TK_PC_FUNCIO  TK_IDENT TK_LPAREN params_formals_ent? TK_RPAREN  TK_PC_RETURN  TK_TIPUS TK_SEMI ;
dec_acc_func: (dec_accio | dec_funcio)+;

imp_accio : TK_PC_ACCIO  TK_IDENT TK_LPAREN params_formals_ent_entsor? TK_RPAREN  (dec_var)* (sentencia)* TK_PC_FACCIO;
imp_funcio : TK_PC_FUNCIO  TK_IDENT TK_LPAREN params_formals_ent? TK_RPAREN  TK_PC_RETURN  TK_TIPUS  (dec_var)* (sentencia)* TK_PC_RETURN expressio TK_SEMI  TK_PC_FFUNCIO;
imp_acc_func : (imp_accio | imp_funcio)*;

// Variables
dec_variables: {
        System.out.println("Inici del bloc de variables");
    } TK_PC_VARIABLES  (dec_var)*  TK_PC_FVARIABLES {
       System.out.println("Final del bloc de variables");
    };

    // ! falta si hi ha +1 identificador, afegir també
dec_var: id=TK_IDENT (TK_COMMA  TK_IDENT)*  TK_COLON  (tip=tipus_tots {
    Registre registre = TS.obtenir($id.text);
        if(TS.existeix($id.text) && registre.getTipusRegistre().equals("VARIABLE")){
            error = true;
            System.err.println("Error semàntic: ja existeix l'id amb lexema " + $id.text);
            System.exit(-1);
        }
        else{
            Registre var = new Registre($id.text,$tip.type,nVars,"VARIABLE");
            TS.inserir($id.text,var);
            nVars++;
            System.out.println("Afegida una variable amb lexema " + $id.text + " i tipus " + $tip.type);
        }
} | TK_IDENT) TK_SEMI;

operand: TK_ENTER | TK_NATURAL | TK_REAL | TK_DATA | TK_BOOLEA | TK_IDENT (acces_tupla | acces_vector | crida_funcio)?;
i: c (TK_OP_QM c TK_COLON c)?;
c: l ((TK_OP_LT | TK_OP_LEQ | TK_OP_EQ | TK_OP_GEQ | TK_OP_GT | TK_OP_NEQ) l)*;
l: e ((TK_OP_OR | TK_OP_AND) e)*;
e: t ((TK_OP_PLUS | TK_OP_MINUS) t)*;
t: s ((TK_STAR | TK_OP_DIV | TK_OP_INT_DIV | TK_OP_MOD) s)*;
s: (TK_OP_MINUS_U | TK_OP_NOT) f | f;
f: operand | TK_LPAREN i TK_RPAREN;

expressio: i | vc=valor_constant {

} | TK_LPAREN f TK_RPAREN;

acces_tupla : TK_DOT TK_IDENT;
acces_vector : TK_LBRACKET f TK_RBRACKET;
crida_funcio: TK_LPAREN expressio (TK_COMMA expressio)* TK_RPAREN;

// Bloc Sentències
sentencia returns [Vector<Long> trad]
    @init {
        System.out.println("Inici bloc de sentencies");
        $trad=new Vector<Long>(10);
    }: (TK_IDENT (a=assign_variable { $trad.addAll($a.trad);}
    | b=crida_accio { $trad.addAll($b.trad);}
    ) | d=condicional {
        if (!error) $trad.addAll($d.trad);
    } | g=mentre{ $trad.addAll($g.trad);}
    | per | repetir | llegir | escriure | escriure_ln);


llegir: TK_PC_LLEGIR TK_LPAREN TK_IDENT TK_RPAREN TK_SEMI;
escriure: TK_PC_ESCRIURE TK_LPAREN expressio (TK_COMMA expressio)* TK_RPAREN TK_SEMI;
escriure_ln: TK_PC_ESCRIURELN TK_LPAREN (expressio (TK_COMMA expressio)*)? TK_RPAREN TK_SEMI;
assign_variable returns [Vector<Long> trad]
    @init {
        $trad = new Vector<Long>();
    }: (acces_vector | acces_tupla)? TK_ASSIGN_VALUE expressio TK_SEMI;
condicional: TK_PC_SI expressio TK_PC_LLAVORS (sentencia)+ (TK_PC_ALTRAMENT (sentencia)*)? TK_PC_FSI;
mentre: TK_PC_MENTRE expressio TK_PC_FER (sentencia)+ TK_PC_FMENTRE;
per: TK_PC_PER TK_IDENT TK_PC_DE expressio TK_PC_FINS expressio TK_PC_FER (sentencia)* TK_PC_FPER;
repetir: TK_PC_REPETIR (sentencia)+ TK_PC_FINSQUE expressio TK_SEMI;
crida_accio: TK_LPAREN (expressio (TK_COMMA expressio)*)? TK_RPAREN TK_SEMI;


tipus_tots returns [String type]:
        tb=tipus_basics {$type=$tb.type;}
    |   id=TK_IDENT {
            if(!TS.existeix($id.text)){
                error = true;
                System.err.println("No existeix un tipus definit amb lexema: " + $id.text + ". Linia " + $id.line + ":" + $id.pos);
                System.exit(-1);
            }
            Registre registre = TS.obtenir($id.text);
            if (!registre.getTipusRegistre().equals(ConstantsTipus.TIPUSNOU)) {
                error = true;
                System.err.println("El lexema " + $id.text + " ha de ser d'un tipus nou. Linia " + $id.line + ":" + $id.pos);
                System.exit(-1);
            }
            $type = registre.getTipus();
        };

tipus_basics returns [String type]:
    TK_PC_INTEGER {$type="I";}
    | TK_PC_CHAR {$type="C";}
    | TK_PC_REAL {$type="F";}
    | TK_PC_BOOLEAN {$type="B";}
    | TK_PC_DATE {$type="D";};


valor_constant returns [String type, String value]:
    val = TK_ENTER { $type = "enter"; $value = $val.text; }
    | val = TK_REAL { $type = "real"; $value = $val.text; }
    | val = TK_CAR { $type = "car"; $value = $val.text; }
    | val = TK_BOOLEA { $type = "bool"; $value = $val.text; }
    | val = TK_DATA { $type = "data"; $value = $val.text; }
    | val = TK_STRING { $type = "string"; $value = $val.text; }
    | sign = TK_OP_MINUS val = TK_ENTER { $type = "enter"; $value = $sign.text + $val.text}
    | sign = TK_OP_MINUS val = TK_REAL { $type = "real"; $value = $sign.text + $val.text};




// Regles Lexiques

TK_WS: ( ' ' | '\t ' | '\n' | '\r' )+ -> skip ;
TK_LPAREN : '(' ;
TK_RPAREN: ')' ;
TK_STAR : '*' ;
TK_OP_PLUS : '+';
TK_OP_MINUS : '-';
TK_OP_DIV : '/';
TK_OP_INT_DIV : '\\';
TK_OP_MOD : '%';
TK_OP_MINUS_U : '~';
TK_OP_EQ : '==';
TK_OP_NEQ : '!=';
TK_OP_LT : '<';
TK_OP_GT : '>';
TK_OP_LEQ : '<=';
TK_OP_GEQ : '>=';
TK_SEMI : ';' ;
TK_COMMA: ',';
TK_DOT: '.';
TK_COLON: ':';
TK_LBRACKET : '[';
TK_RBRACKET : ']';
TK_EXPONENT : 'E';
TK_ASSIGN_VALUE: ':=';
TK_PC_PROGRAMA: 'programa'  {System.out.println("he reconegut programa");};
TK_PC_FPROGRAMA: 'fprograma'  ;
TK_PC_CONSTANTS: 'constants' ;
TK_PC_FCONSTANTS: 'fconstants' ;
TK_PC_TIPUS: 'tipus' ;
TK_PC_FTIPUS: 'ftipus' ;
TK_PC_PERIODE: 'periode';
TK_PC_PER: 'per';
TK_PC_DE: 'de';
TK_PC_FINS: 'fins';
TK_PC_FPER: 'fper';
TK_PC_MENTRE: 'mentre';
TK_PC_FER: 'fer';
TK_PC_FMENTRE: 'fmentre';
TK_PC_REPETIR: 'repetir';
TK_PC_FINSQUE: 'finsque';
TK_PC_SI: 'si';
TK_PC_LLAVORS: 'llavors';
TK_PC_ALTRAMENT: 'altrament';
TK_PC_LLEGIR: 'llegir';
TK_PC_ESCRIURE: 'escriure';
TK_PC_ESCRIURELN: 'escriureln';
TK_PC_FSI: 'fsi';
TK_OP_NOT : 'no';
TK_OP_AND : '&';
TK_OP_OR : '|';
TK_OP_QM : '?';
fragment
DIGIT : '1' .. '9' ;
fragment
DIGIT_COMPLET : '0' .. '9' ;
fragment
LLETRA : 'a' .. 'z' | 'A' .. 'Z' ;
TK_ENTER : '0' | DIGIT (DIGIT|'0')* ;
TK_NATURAL : DIGIT (DIGIT|'0')* ;
TK_TIPUS : TK_PC_ENTER | TK_PC_REAL | TK_PC_CAR | TK_PC_BOOL | TK_PC_DATA ;
TK_PC_ENTER : 'enter';
TK_PC_REAL : 'real';
TK_PC_CAR : 'car';
TK_PC_BOOL : 'boolea';
TK_PC_DATA : 'data';


TK_BOOLEA : TK_PC_CERT | TK_PC_FALS ;
TK_PC_CERT : 'cert';
TK_PC_FALS : 'fals';

TK_PC_VECTOR : 'vector';
TK_PC_TUPLA : 'tupla';
TK_PC_FTUPLA : 'ftupla';
TK_PC_INICI_INDEX : 'inici';
TK_PC_MIDA : 'mida';
TK_PC_ENT : 'ent';
TK_PC_ENTSOR : 'entsor';


TK_PC_ACCIO : 'accio' ;
TK_PC_FACCIO : 'faccio' ;
TK_PC_FUNCIO : 'funcio' ;
TK_PC_FFUNCIO : 'ffuncio' ;
TK_PC_VARIABLES : 'variables';
TK_PC_FVARIABLES : 'fvariables';

TK_PC_RETURN : 'retorna' ;

TK_IDENT : LLETRA (LLETRA | DIGIT | '0' | '_' ) * ;
TK_REAL : (TK_ENTER TK_DOT DIGIT_COMPLET+) | (TK_ENTER (TK_DOT DIGIT_COMPLET+)? TK_EXPONENT TK_ENTER) ;
TK_ASCII : ' ' | '!' | ('#' .. '~') ; // Skip double quotes
TK_CAR : '\'' TK_ASCII '\'' ;


TK_DIA31 : '0' ('1'..'9') | ('1'|'2')('0'..'9') | '3' ('0'|'1') ;
TK_MESOS31 : '01' | '03' | '05' | '07' | '08' | '10' | '12' ;
TK_DIA30 : '0' ('1'..'9') | ('1'|'2')('0'..'9') | '30' ;
TK_MESOS30 : '04' | '06' | '09' | '11' ;
TK_DIA28 : '0' ('1'..'9') | ('1')('0'..'9') | '2' ('0'..'8') ;
TK_MES28 : '02' ;
TK_ANY : '19' ('8'..'9') ('0'..'9') | '2' ('0'..'9') ('0'..'9') ('0'..'9') ;
TK_DATA : (TK_DIA31 '/' TK_MESOS31 | TK_DIA30 '/' TK_MESOS30 | TK_DIA28 '/' TK_MES28) '/' TK_ANY;


TK_STRING: '"' (TK_ASCII TK_WS*)* '"';

TK_LINE_COMMENT : '//' TK_ASCII* ->skip;
TK_BLOCK_COMMENT : '/*' (TK_ASCII | TK_WS)* '*/' ->skip;




