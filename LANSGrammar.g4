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
            Long adreca = BC.addConstName($nom.text, $tipus.text, $valor.text);
            Registre reg = new Registre($nom.text, $tipus.text, adreca);
            TS.inserir($nom.text, reg);
        };
    } TK_SEMI;

// Bloc Vector
vector: TK_PC_VECTOR  tipus_basics  TK_PC_MIDA  TK_ENTER ( TK_PC_INICI_INDEX  TK_ENTER)? ;

// Bloc Tupla
tupla: TK_PC_TUPLA  (id=TK_IDENT  TK_COLON  tb=tipus_basics TK_SEMI )+ TK_PC_FTUPLA ;


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
        else {
            Registre reg = new Registre($id.text, "TIPUSNOU", null);
            TS.inserir($id.text, reg);
        }
    } TK_COLON  (vector | tupla) TK_SEMI;

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


operand returns [Vector<Long> trad, String type]
    : (enter=TK_ENTER {
        Long addr = BC.addConstant("I", $enter.text);
        $trad.add(BC.LDC_W);
        $trad.add(BC.nByte(addr, 2));
        $trad.add(BC.nByte(addr, 1));
        $type = "I";
    }
    | real=TK_REAL {
        Long addr = BC.addConstant("F", $real.text);
        $trad.add(BC.LDC_W);
        $trad.add(BC.nByte(addr, 2));
        $trad.add(BC.nByte(addr, 1));
        $type = "F";
    }
    | data=TK_DATA {
        Long addr = BC.addConstant("D", $data.text);
        $trad.add(BC.LDC_W);
        $trad.add(BC.nByte(addr, 2));
        $trad.add(BC.nByte(addr, 1));
        $type = "D";
    }
    | boolea=TK_BOOLEA {
        Long addr = BC.addConstant("Z", $boolea.text);
        $trad.add(BC.LDC_W);
        $trad.add(BC.nByte(addr, 2));
        $trad.add(BC.nByte(addr, 1));
        $type = "Z";
    })
    | id=TK_IDENT {
        if (!TS.existeix($id.text)) {
            error = true;
            System.err.println("Error semàntic: no existeix l'id amb lexema " + $id.text + ". Linia " + $id.line + ":" + $id.pos);
            System.exit(-1);
        }

        Registre reg = TS.obtenir($id.text);
        $type = reg.getTipus();
        Long addr = reg.getAdreca();
        String tipusReg = reg.getTipusRegistre();

        if (tipusReg.equals("VARIABLE")) {
            if ($type.equals("F")) $trad.add(BC.FLOAD);
            else $trad.add(BC.ILOAD);
            $trad.add(addr);
        }
        else {
            $trad.add(BC.LDC_W);
            $trad.add(BC.nByte(addr, 2));
            $trad.add(BC.nByte(addr, 1));
        }
    } (acces_tupla | acces_vector | crida_funcio)?;

i returns [Vector<Long> trad, String type]
    : a=c {
        $trad = $a.trad;
        $type = $a.type;
    } (TK_OP_QM b=c TK_COLON d=c)?;

c returns [Vector<Long> trad, String type]
    : a=l {
        $trad = $a.trad;
        $type = $a.type;
    } (op=(TK_OP_LT | TK_OP_LEQ | TK_OP_EQ | TK_OP_GEQ | TK_OP_GT | TK_OP_NEQ) b=l {
        if ($op.text.equals("==") || $op.text.equals("!=")) {
            if ($type!=$b.type && (!$type.equals("I") || !$type.equals("F"))
                && (!$b.type.equals("I") || !$b.type.equals("F"))) {
                error = true;
                System.err.println("Els operands d'igualtat o desigualtat han de ser del mateix tipus o enters i reals. Linia " + $op.line + ":" + $op.pos);
                System.exit(-1);
            }
            if (!$type.equals("F")) $trad.add(BC.I2F); // si e1 no es real, fem el pas d'enter a real a trad
            $trad.addAll($b.trad); // afegim b a trad
            if (!$b.type.equals("F")) $trad.add(BC.I2F); // si b no es real, fem el pas d'enter a real a trad
        }
        else if (!$type.equals("I") && !$type.equals("F")
                 && !$b.type.equals("I") && !$b.type.equals("F")
                 && !$type.equals("D") && !$b.type.equals("D")) {
            error = true;
            System.err.println("Els operands d'una operació relacional han de ser enters o reals. Linia " + $op.line + ":" + $op.pos);
            System.exit(-1);
        }
        else {
            if ($type.equals("I")) $trad.add(BC.I2F);
            $trad.addAll($b.trad);
            if ($b.type.equals("I")) $trad.add(BC.I2F);
        }
        $trad.add(BC.FCMPG); // els dos valors reals anteriors
        if ($op.text.equals("==")) $trad.add(BC.IFEQ);
        else if ($op.text.equals("!=")) $trad.add(BC.IFNE);
        else if ($op.text.equals("<")) $trad.add(BC.IFLT);
        else if ($op.text.equals("<=")) $trad.add(BC.IFLE);
        else if ($op.text.equals(">")) $trad.add(BC.IFGT);
        else if ($op.text.equals(">=")) $trad.add(BC.IFGE);
        $trad.add(BC.nByte(8L,2));
        $trad.add(BC.nByte(8L,1));
        $trad.add(BC.BIPUSH);
        $trad.add(0L);
        $trad.add(BC.GOTO);
        $trad.add(BC.nByte(5L,2));
        $trad.add(BC.nByte(5L,1));
        $trad.add(BC.BIPUSH);
        $trad.add(1L);
        $type = "Z";
    })*;

l returns [Vector<Long> trad, String type]
    : a=e {
        $trad = $a.trad;
        $type = $a.type;
    } (op=(TK_OP_OR | TK_OP_AND) b=e {
        if ($type.equals("Z") && $b.type.equals("Z")) {
            $trad.addAll($b.trad);
            if ($op.text.equals("|")) $trad.add(BC.IOR);
            else $trad.add(BC.IAND);
        }
        else {
            error = true;
            System.err.println("Els operands han de ser de tipus booleà. Linia " + $op.line + ":" + $op.pos);
            System.exit(-1);
        }
    })*;

e returns [Vector<Long> trad, String type] locals [boolean operacioEntera]
    : a=t {
        $trad = $a.trad;
        $type = $a.type;
    } (op=(TK_OP_PLUS | TK_OP_MINUS) b=t {
        if($type.equals("D") || $b.type.equals("D")){
            if ($type.equals("I") || $b.type.equals("I")) {
                $trad.addAll($b.trad);
                $type = "D";
                if ($op.text.equals("+")) $trad.add(BC.IADD);
                else $trad.add(BC.ISUB);
            }
        }
        else if (!$type.equals("I") && !$type.equals("F") && !$b.type.equals("I") && !$b.type.equals("F")) {
            error = true;
            System.err.println("Els operands d'una operació aritmetica han de ser enters o reals. Línia " + $op.line + ":" + $op.pos);
            System.exit(-1);
        }
        $operacioEntera = $type.equals("I") && $b.type.equals("I");
        if (!$operacioEntera) {
            if ($type.equals("I")) $trad.add(BC.I2F);
            $trad.addAll($b.trad);
            if ($b.type.equals("I")) $trad.add(BC.I2F);
            $type = "F";
            if ($op.text.equals("+")) $trad.add(BC.FADD);
            else $trad.add(BC.FSUB);
        }
        else {
            $trad.addAll($b.trad);
            $type = "I";
            if ($op.text.equals("+")) $trad.add(BC.IADD);
            else $trad.add(BC.ISUB);
        }
    })*;

t returns [Vector<Long> trad, String type] locals [boolean operacioEntera]
    : a=s {
        $trad = $a.trad;
        $type = $a.type;
    } (op=(TK_STAR | TK_OP_DIV | TK_OP_INT_DIV | TK_OP_MOD) b=s {
        if (!$type.equals("I") && !$type.equals("F") &&
            !$b.type.equals("I") && !$b.type.equals("F")) {
            error = true;
            System.err.println("Els operands d'una operació aritmetica han de ser enters o reals. Linia " + $op.line + ":" + $op.pos);
            System.exit(-1);
        }
        $operacioEntera = $type.equals("I") && $b.type.equals("I");
        if ($op.text.equals("\\") || $op.text.equals("%")) { // divisio entera i modul enter
            if (!$type.equals("I")) $trad.add(BC.F2I);
            $trad.addAll($b.trad);
            if (!$b.type.equals("I")) $trad.add(BC.F2I);
            $type = "I";
            if ($op.text.equals("\\")) $trad.add(BC.IDIV);
            else if ($op.text.equals("%")) $trad.add(BC.FREM);
        }
        else if (!$operacioEntera) { // multiplicacio i divisio real
            if ($type.equals("I")) $trad.add(BC.I2F);
            $trad.addAll($b.trad);
            if ($b.type.equals("I")) $trad.add(BC.I2F);
            $type = "F";
            if ($op.text.equals("*")) $trad.add(BC.FMUL);
            else if ($op.text.equals("/")) $trad.add(BC.FDIV);
        }
        else { // multiplicacio entera
            $trad.addAll($b.trad);
            $type = "I";
            if ($op.text.equals("*")) $trad.add(BC.IMUL);
        }
    })*;

s returns [Vector<Long> trad, String type]
    : op=(TK_OP_MINUS_U | TK_OP_NOT)? a=f {
        $trad = $a.trad;
        $type = $a.type;

        if ($op!=null) {
            if($op.text.equals("~")){
                if(!$a.type.equals("I") && !$a.type.equals("F")){
                    error = true;
                    System.err.println("L'operador de menys unari només està definit per enters i reals. Linia " + $op.line + ":" + $op.pos);
                    System.exit(-1);
                }
                else if($a.type.equals("F")) $trad.add(BC.FNEG);
                else $trad.add(BC.INEG);
            }
            else{ // el 'no'
                if(!$a.type.equals("Z")) {
                    error = true;
                    System.err.println("L'operador de no lògic només està definit per booleans. Linia " + $op.line + ":" + $op.pos);
                    System.exit(-1);
                }
                // Sumem 1 i fem el modul de 2 per negar
                // ref: https://www.generacodice.com/en/articolo/4919243/generating-jvm-bytecode-for-a-unary-not-expression
                $trad.add(BC.BIPUSH);
                $trad.add(1L);
                $trad.add(BC.IADD);
                $trad.add(BC.BIPUSH);
                $trad.add(2L);
                $trad.add(BC.IREM);
            }
        }
    };

f returns [Vector<Long> trad, String type]
    : a=operand {
        $trad = $a.trad;
        $type = $a.type;
    }
    | TK_LPAREN b=i TK_RPAREN {
        $trad = $b.trad;
        $type = $b.type;
    };

expressio returns [Vector<Long> trad, String type]
    @init {
        $trad = new Vector<Long>();
    }: i | vc=valor_constant {

} | TK_LPAREN f TK_RPAREN;

acces_tupla returns [Vector<Long> trad, String type]
    : TK_DOT TK_IDENT {
        $trad = new Vector<Long>();
        $type = "I";
    };
acces_vector returns [Vector<Long> trad, String type]: TK_LBRACKET f TK_RBRACKET;
crida_funcio returns [Vector<Long> trad, String type]: TK_LPAREN expressio (TK_COMMA expressio)* TK_RPAREN;

// Bloc Sentències
sentencia returns [Vector<Long> trad]
    @init {
        System.out.println("Inici bloc de sentencies");
        $trad=new Vector<Long>(10);
    }: (TK_IDENT (a=assign_variable { $trad.addAll($a.trad);}
    | b=crida_accio {  } // falta implementar les accions
    ) | d=condicional {
        if (!error) $trad.addAll($d.trad);
    } | g=mentre{ $trad.addAll($g.trad);}
    | per | repetir | llegir | escriure | escriure_ln);

// Lectura
llegir returns [Vector<Long> trad]
    @init {
        $trad = new Vector<Long>();
    }: TK_PC_LLEGIR TK_LPAREN TK_IDENT TK_RPAREN TK_SEMI;

// Escriptura
escriure returns [Vector<Long> trad]
    @init {
        $trad = new Vector<Long>();
    }: TK_PC_ESCRIURE TK_LPAREN e1=expressio {$trad=$e1.trad;}
    (TK_COMMA e2=expressio {$trad=$e2.trad;})* TK_RPAREN TK_SEMI;

escriure_ln returns [Vector<Long> trad]
    @init {
        $trad = new Vector<Long>();
    }: TK_PC_ESCRIURELN TK_LPAREN (ex=expressio {$trad=$ex.trad;}
    (TK_COMMA ex2=expressio {$trad=$ex.trad;})*)? TK_RPAREN TK_SEMI {
        String str = "\n";
        Long addr = BC.addConstant("S",str);
        $trad.add(BC.LDC_W);
        $trad.add(BC.nByte(addr,2));
        $trad.add(BC.nByte(addr,1));
        $trad.add(BC.INVOKESTATIC);
        $trad.add(BC.nByte(BC.mPutString, 2));
        $trad.add(BC.nByte(BC.mPutString, 1));
    };

assign_variable returns [Vector<Long> trad]
    @init {
        $trad = new Vector<Long>();
    }: (acces_vector | acces_tupla)? TK_ASSIGN_VALUE expressio TK_SEMI;

// Condicional
condicional returns [Vector<Long> trad] locals [Vector<Long> tradIf, Vector<Long> tradElse]
    @init {
      $trad = new Vector<Long>();
      $tradIf = new Vector<Long>();
      $tradElse = new Vector<Long>();
    }: si=TK_PC_SI ex=expressio {
        if (!$ex.type.equals("Z")) {
            error = true;
            System.err.println("Error semàntic: l'expressió d'un condicional ha de ser de tipus boolea. Linia " + $si.line + ":" + $si.pos);
            System.exit(-1);
        }
    } TK_PC_LLAVORS (s1=sentencia)+ {
        $tradIf = $s1.trad;
    } (TK_PC_ALTRAMENT (s2=sentencia {
        $tradElse = $s2.trad;
    })*)? TK_PC_FSI {
        Long ifFals = new Long($tradIf.size() + 4);
        Long elseFals = new Long($tradElse.size() + 2);

        $trad.addAll($ex.trad);

        $trad.add(BC.IFEQ);
        $trad.add(BC.nByte(ifFals,2));
        $trad.add(BC.nByte(ifFals,1));
        $trad.addAll($tradIf);

        $trad.add(BC.GOTO);
        $trad.add(BC.nByte(elseFals,2));
        $trad.add(BC.nByte(elseFals,1));
        $trad.addAll($tradElse);
    };

// Bucles
mentre returns [Vector<Long> trad] locals [Vector<Long> tradMentre]
    @init {
        $trad = new Vector<Long>();
        $tradMentre = new Vector<Long>();
    }: w=TK_PC_MENTRE ex=expressio {
        if (!$ex.type.equals("Z")) {
            error = true;
            System.err.println("Error semàntic: l'expressió ha de ser tipus booleana. Linia " + $w.line + ":" + $w.pos);
            System.exit(-1);
        }
    } TK_PC_FER (se=sentencia{
        $tradMentre = $se.trad;
    })+ TK_PC_FMENTRE{
        Long midaSaltFi = new Long($tradMentre.size() + 6);
        Long midaSaltInici = new Long(-$tradMentre.size() - 6);

        $trad.addAll($ex.trad);

        $trad.add(BC.IFEQ);
        $trad.add(BC.nByte(midaSaltFi,2));
        $trad.add(BC.nByte(midaSaltFi,1));
        $trad.addAll($tradMentre);

        $trad.add(BC.GOTO);
        $trad.add(BC.nByte(midaSaltInici,2));
        $trad.add(BC.nByte(midaSaltInici,1));
    };

per returns [Vector<Long> trad] locals [Vector<Long> tradPer, Registre registre, Long pas]
    @init {
        $trad = new Vector<Long>();
        $tradPer = new Vector<Long>();
        $pas = 1L;
    }: TK_PC_PER id=TK_IDENT {
        if(!TS.existeix($id.text)){
            error = true;
            System.err.println("Error semàntic: no existeix una variable amb lexema " + $id.text + ". Linia " + $id.line + ":" + $id.pos);
            System.exit(-1);
        }
        $registre = TS.obtenir($id.text);
        if (!$registre.getTipusRegistre().equals("VARIABLE") &&
            !$registre.getTipus().equals("I")) {
            error = true;
            System.err.println("Error semàntic: la variable de control d'un per ha de ser entera. Linia " + $id.line + ":" + $id.pos);
            System.exit(-1);
        }
    } de=TK_PC_DE ex=expressio {
        if (!$ex.type.equals("I")) {
            error = true;
            System.err.println("Error semàntic: l'expressió d'inici d'un per ha de ser entera. Linia " + $de.line + ":" + $de.pos);
            System.exit(-1);
        }
    } fins=TK_PC_FINS exfi=expressio {
        if (!$exfi.type.equals("I")) {
            error = true;
            System.err.println("Error semàntic: l'expressió de fi d'un per ha de ser entera. Linia " + $fins.line + ":" + $fins.pos);
            System.exit(-1);
        }
    } TK_PC_FER (se=sentencia {
        $tradPer = $se.trad;
    })* TK_PC_FPER {
        Long addrId = $registre.getAdreca();
        Long midaSaltFi = new Long($tradPer.size()+9);
        Long midaSaltInici = new Long(-$tradPer.size()-$ex.trad.size()-9);

        $trad.addAll($ex.trad);
        $trad.add(BC.DUP); // duplica l'expressio inicial i la posa a la pila
        $trad.add(BC.ISTORE); // guarda el valor inicial duplicat
        $trad.add(addrId);

        $trad.addAll($exfi.trad);
        $trad.add(BC.IF_ICMPGT);
        $trad.add(BC.nByte(midaSaltFi,2));
        $trad.add(BC.nByte(midaSaltFi,1));

        $trad.addAll($tradPer);

        $trad.add(BC.ILOAD); // recupera valor inicial per sumar-li el pas
        $trad.add(addrId);
        $trad.add($pas); // valor 1
        $trad.add(BC.IADD); // suma els dos valors top de la pila

        $trad.add(BC.GOTO);
        $trad.add(BC.nByte(midaSaltInici,2));
        $trad.add(BC.nByte(midaSaltInici,1));
    };

repetir returns [Vector<Long> trad] locals [Vector<Long> tradRep]
    @init {
       $trad = new Vector<Long>();
       $tradRep = new Vector<Long>();
    }: TK_PC_REPETIR (se=sentencia {
        $tradRep = $se.trad;
    })+ r=TK_PC_FINSQUE ex=expressio {
        if (!$ex.type.equals("Z")) {
            error = true;
            System.err.println("Error semàntic: l'expressió ha de ser tipus booleana. Linia " + $r.line + ":" + $r.pos);
            System.exit(-1);
    }
    } TK_SEMI{
        Long midaSaltInici = new Long(-$tradRep.size()-$ex.trad.size());
        $trad.addAll($tradRep);
        $trad.addAll($ex.trad);
        $trad.add(BC.IFEQ);
        $trad.add(BC.nByte(midaSaltInici,2));
        $trad.add(BC.nByte(midaSaltInici,1));
    };

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
            if (!registre.getTipus().equals("TIPUSNOU")) {
                error = true;
                System.err.println("El lexema " + $id.text + " ha de ser d'un tipus nou. Linia " + $id.line + ":" + $id.pos);
                System.exit(-1);
            }
            $type = registre.getTipus();
        };

tipus_basics returns [String type]:
    TK_PC_ENTER {$type="I";}
    | TK_PC_CAR {$type="C";}
    | TK_PC_REAL {$type="F";}
    | TK_PC_BOOL {$type="Z";}
    | TK_PC_DATA {$type="D";};


valor_constant returns [String type, String value]:
    val = TK_ENTER { $type = "I"; $value = $val.text; }
    | val = TK_REAL { $type = "F"; $value = $val.text; }
    | val = TK_CAR { $type = "C"; $value = $val.text; }
    | val = TK_BOOLEA { $type = "Z"; $value = $val.text; }
    | val = TK_DATA { $type = "D"; $value = $val.text; }
    | val = TK_STRING { $type = "S"; $value = $val.text; }
    | sign = TK_OP_MINUS val = TK_ENTER { $type = "I"; $value = $sign.text + $val.text; }
    | sign = TK_OP_MINUS val = TK_REAL { $type = "F"; $value = $sign.text + $val.text; };




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




