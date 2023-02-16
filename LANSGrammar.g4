/*
 * Carla Davesa, Martí Mas. (C) 2022. All rights reserved.
 */

grammar LANSGrammar;

@header{
    import java.io.*;
    import java.util.Vector;
}

@parser::members{
     SymTable TS = new SymTable<Registre>(1000);
     Bytecode BC = new Bytecode("ResultatsFitxerCompilat");

     boolean error = false;
     Long nVars = 0L;

     Counter counter = new Counter();

     Long endLine;

     //override method
     public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e){
          super.notifyErrorListeners(offendingToken,msg,e);
          error=true;
     }
}

// Regles sintàctiques i semàntiques
inici
    @init {
        endLine= bytecode.addConstant("S", "\n");
        System.out.println("Inici de compilació");
        Vector<Long> trad = new Vector<Long>();
    }
    @after {
        trad.add(BC.RETURN);
        BC.addMainCode(1000L,1000L,trad);
        BC.write();
        System.out.println("Fi de compilació");
    }
    : {
        System.out.println("Inicia els blocs");
        Scope scope = new Scope(s_global, "s_programa");
        scope.setEsScopePrograma(true);
        TScopes.inserir(scope.getNom(), scope);
    }
    dc=dec_constants[s_global]?
    dt=dec_tipus[s_global]?
    daf=dec_acc_func?
    prog = programa[scope] {
        if (!error) {
            trad.addAll($prog.trad);
        }
    }
    imp_acc_func?
    EOF {
        if (!error) {
            for (Scope value : TScopes.valors()) {
                if (!value.isImplementat()) {
                    notifyErrorListeners("Error! La funció o acció " +
                    value.getNom().substring(2,value.getNom().length()) + " no està implementada.");
                }
            }
            CTS.llistatClaus();
            for (Scope scope : TScopes.valors()) {
                System.out.println(scope.getNom() + " " + scope.getMaxStack());
            }

            if (!error) {
                trad.add(bytecode.RETURN);
                System.out.println(s_global.getNom() + " " + s_global.getMaxStack());
                bytecode.addMainCode(s_global.getMaxStack(), s_global.getContVar() + 5, trad);
                bytecode.write();
                bytecode.show();
            }
        }
    };

// Programa
programa[Scope scope] returns [Vector<Long> trad]
    @init {
        System.out.println("Inici de programa");
        $trad = new Vector<Long>(10);
    }
    @after {
        System.out.println("Fi de programa");
    }
    : TK_PC_PROGRAMA  TK_IDENT dec_variables[scope]? (n=sentencia[scope] {
        if (!error) $trad.addAll($n.trad);
    })+ TK_PC_FPROGRAMA {
        System.out.println("Final del bloc del programa");
    };

// Constants
dec_constants [Scope scope] returns [Vector<Long> trad]
    @init {
        System.out.println("Inici del bloc de constants");
        $trad = new Vector<Long>(10);
    }: TK_PC_CONSTANTS  a=assign_constant[scope]+ {
        if (!error) $trad = $a.trad;
    } TK_PC_FCONSTANTS {
        System.out.println("Fi del bloc de constants");
    };

    // falta acabar
assign_constant [Scope scope] returns [Vector<Long> trad]
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

dec_tipus [Scope scope]: TK_PC_TIPUS  (declaracio_tipus_nou)+ TK_PC_FTIPUS;
vector: TK_PC_VECTOR  TK_TIPUS  TK_PC_MIDA  TK_ENTER ( TK_PC_INICI_INDEX  TK_ENTER)? ;
tupla: TK_PC_TUPLA  (TK_IDENT  TK_COLON  TK_TIPUS TK_SEMI )+ TK_PC_FTUPLA ;
declaracio_tipus_nou : TK_IDENT  TK_COLON  (vector | tupla) TK_SEMI;


params_formals_ent : (TK_PC_ENT?  TK_IDENT  TK_COLON  (TK_TIPUS | TK_IDENT) (TK_COMMA  TK_PC_ENT?  TK_IDENT  TK_COLON  (TK_TIPUS | TK_IDENT))*)+;
params_formals_ent_entsor : ((TK_PC_ENT | TK_PC_ENTSOR)?  TK_IDENT  TK_COLON  (TK_TIPUS | TK_IDENT) (TK_COMMA  (TK_PC_ENT | TK_PC_ENTSOR)?  TK_IDENT  TK_COLON  (TK_TIPUS | TK_IDENT))*)+ ;
dec_accio : TK_PC_ACCIO  TK_IDENT TK_LPAREN params_formals_ent_entsor? TK_RPAREN TK_SEMI ;
dec_funcio : TK_PC_FUNCIO  TK_IDENT TK_LPAREN params_formals_ent? TK_RPAREN  TK_PC_RETURN  TK_TIPUS TK_SEMI ;
dec_acc_func: (dec_accio | dec_funcio)+;

imp_accio : TK_PC_ACCIO  TK_IDENT TK_LPAREN params_formals_ent_entsor? TK_RPAREN  (dec_var[scope])* (sentencia[scope])* TK_PC_FACCIO;
imp_funcio : TK_PC_FUNCIO  TK_IDENT TK_LPAREN params_formals_ent? TK_RPAREN  TK_PC_RETURN  TK_TIPUS  (dec_var[scope])* (sentencia[scope])* TK_PC_RETURN expressio TK_SEMI  TK_PC_FFUNCIO;
imp_acc_func : (imp_accio | imp_funcio)*;

// Variables
dec_variables[Scope scope]: {
        System.out.println("Inici del bloc de variables");
    } v=TK_PC_VARIABLES  (dec_var[scope])*  TK_PC_FVARIABLES {
       System.out.println("Final del bloc de variables");
    };

    // ! falta si hi ha +1 identificador, afegir també
dec_var[Scope scope]: v=TK_IDENT (TK_COMMA  TK_IDENT)*  TK_COLON  (tt=TK_TIPUS {
    if (!CTS.existeix(scope, $v.text)) {
        CTS.inserir(scope, $v.text, Registre.CrearRegistreVariable($v.text, $t.tipus, scope.getNextContVar()));
    } else {
        notifyErrorListeners($v, "Error! La variable " + $v.text + " ja està declarada.", null);
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


sentencia [Scope scope] returns [Vector<Long> trad]
    @init {
        $trad=new Vector<Long>(10);
    }: (TK_IDENT (a=assign_variable[scope] {
        if (!error) $trad.addAll($a.trad);
    } | b=crida_accio[scope] {
        if (!error) $trad.addAll($b.trad);
    }) | d=condicional[scope] {
        if (!error) $trad.addAll($d.trad);
    } | g=mentre[scope]{
        if (!error) $trad.addAll($g.trad);
    } | per | repetir | llegir | escriure | escriure_ln);


llegir: TK_PC_LLEGIR TK_LPAREN TK_IDENT TK_RPAREN TK_SEMI;
escriure: TK_PC_ESCRIURE TK_LPAREN expressio (TK_COMMA expressio)* TK_RPAREN TK_SEMI;
escriure_ln: TK_PC_ESCRIURELN TK_LPAREN (expressio (TK_COMMA expressio)*)? TK_RPAREN TK_SEMI;
assign_variable [Scope scope]: (acces_vector | acces_tupla)? TK_ASSIGN_VALUE expressio TK_SEMI;
condicional [Scope scope]: TK_PC_SI expressio TK_PC_LLAVORS (sentencia[scope])+ (TK_PC_ALTRAMENT (sentencia[scope])*)? TK_PC_FSI;
mentre [Scope scope]: TK_PC_MENTRE expressio TK_PC_FER (sentencia[scope])+ TK_PC_FMENTRE;
per: TK_PC_PER TK_IDENT TK_PC_DE expressio TK_PC_FINS expressio TK_PC_FER (sentencia[scope])* TK_PC_FPER;
repetir: TK_PC_REPETIR (sentencia[scope])+ TK_PC_FINSQUE expressio TK_SEMI;
crida_accio [Scope scope]: TK_LPAREN (expressio (TK_COMMA expressio)*)? TK_RPAREN TK_SEMI;

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




