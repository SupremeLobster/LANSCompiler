grammar tiny;

@header {
import java.io.*;
import java.lang.Object;
import java.util.Vector;
}

@members {
SymTable TS = new SymTable<Registre>(1001);
int contVar=0;
Bytecode x;
Boolean errorsem=false; 
Long saltLinia;
}


WS	:	(' '
	|	'\t'
	|	'\n'
	|	'\r') -> skip
	;


IF : 'if';
THEN : 'then';
ELSE : 'else';
EIF : 'eif';
WHILE : 'while';
DO : 'do';
EWHILE : 'ewhile';
WRITE : 'write';
NOT : 'not';
READ : 'read';
 
PO : '('; 
PT : ')'; 
PC: ';'; 
OP_SUMA: '+';
OP_IGUAL : '=';
OP_MESPETIT : '<';
ASSIGNACIO : ':=' ;


fragment 
DIGIT: ('0'..'9');
fragment 
LLETRA: ('a'..'z'|'A'..'Z');


ID : 
	LLETRA(LLETRA|DIGIT|'_')*
;


NUM : (DIGIT)+ 
;


 
p        
@init 	  { 		
	  x=new Bytecode("compilat");
	  saltLinia=x.addConstant("S","\n");    
	  Vector<Long> trad = new Vector<Long>(10); 
	  }
          :
	  (cc=c {trad.addAll($cc.trad);} )+
	  {
	   	if (!errorsem)
	   		{
	   		trad.add(x.RETURN);
	   		x.addMainCode(10L,10L,trad);
	   		x.write();
	   		}
	  }
	;
            

c returns [Vector<Long> trad]	
@init 	{
	$trad=new Vector<Long>(10);
    } 
         :
           i=ID ASSIGNACIO ee=e PC
	   {
	   if ($ee.tipus=='I')
	   	{
	   	Registre r;
	   	if (!(TS.existeix($i.text)))
	   		{
	   		r=new Registre($i.text,'I',contVar++);
	   		TS.inserir($i.text,r);
	   		}
	   	r=(Registre)TS.obtenir($i.text);
	   	$trad=$ee.trad;
	   	$trad.add(x.ISTORE);
	   	$trad.add(new Long(r.getAdreca()));
	   	}
	   } 
	| IF ee=e {Vector<Long> trad2 = new Vector<Long>(10);Vector<Long> trad3 = new Vector<Long>(10);}
	    THEN (cc=c {trad2.addAll($cc.trad);})* (ELSE (cc2=c {trad3.addAll($cc2.trad);})*)? EIF
            {
	    if ($ee.tipus == 'Z')
	   	{
	   	$trad=$ee.trad;
	   	$trad.add(x.IFNE);
	   	Long salt=trad2.size()+6L;
	   	$trad.add(x.nByte(salt,2));
	   	$trad.add(x.nByte(salt,1));
	   	$trad.addAll(trad2);
	   	$trad.add(x.GOTO);
	   	salt=trad3.size()+3L; 	
	   	$trad.add(x.nByte(salt,2));
	   	$trad.add(x.nByte(salt,1));
	   	$trad.addAll(trad3);
	   	}
	   }       
	| WHILE ee=e {Vector<Long> trad2 = new Vector<Long>(10);} DO
	   (cc=c {trad2.addAll($cc.trad);})* EWHILE
	   {
	   if ($ee.tipus == 'Z')
	   	{
	   	$trad=$ee.trad;
	   	$trad.add(x.IFNE);
	   	Long salt=trad2.size()+6L;
	   	$trad.add(x.nByte(salt,2));
	   	$trad.add(x.nByte(salt,1));
	   	$trad.addAll(trad2);
	   	salt=0L-$trad.size();
	   	$trad.add(x.GOTO);
	   	$trad.add(x.nByte(salt,2));
	   	$trad.add(x.nByte(salt,1));
	   	}
	   }
	| WRITE PO ee=e PT PC
           {
	   if ($ee.tipus != 'E')
	   	{
	   	$trad=$ee.trad;
	   	$trad.add(x.INVOKESTATIC);
	   	if ($ee.tipus=='I')
	   		{
	   		$trad.add(x.nByte(x.mPutInt,2));
	   		$trad.add(x.nByte(x.mPutInt,1));
	   		}
	   	else
	   		{
	   		$trad.add(x.nByte(x.mPutBoolean,2));
	   		$trad.add(x.nByte(x.mPutBoolean,1));	   	
	   		}
    	   	$trad.add(x.LDC_W);
	   	$trad.add(x.nByte(saltLinia,2));
	   	$trad.add(x.nByte(saltLinia,1));
    	   	$trad.add(x.INVOKESTATIC);
	   	$trad.add(x.nByte(x.mPutString,2));
	   	$trad.add(x.nByte(x.mPutString,1));
	   	}
	   }

	;



e returns [Vector<Long> trad, char tipus]	
@init 	{
	$trad=new Vector<Long>(10);
	}
	: ee=e2 
        {
         $trad=$ee.trad;
         $tipus=$ee.tipus;
        }
        (OP_IGUAL e22=e
        {
	 if ($ee.tipus==$e22.tipus)
			{
			$trad.addAll($e22.trad);
			$trad.add(x.IF_ICMPNE);
	   		Long salt=8L;
	   		$trad.add(x.nByte(salt,2));
	   		$trad.add(x.nByte(salt,1));
			$trad.add(x.BIPUSH);
			$trad.add(0L);
			$trad.add(x.GOTO);
	   		salt=5L;
	   		$trad.add(x.nByte(salt,2));
	   		$trad.add(x.nByte(salt,1));
			$trad.add(x.BIPUSH);
			$trad.add(1L);	   		
			$tipus='Z';
			}
		else
			{
			$tipus='E';
			}
		}
            )?
	;
		
e2 returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(10);
	}
	: ee=e3
        {
         $trad=$ee.trad;
         $tipus=$ee.tipus;
        }	
        (OP_SUMA e22=e2
            {
		if ($ee.tipus=='I' && $e22.tipus=='I')
			{
			$trad=$ee.trad;
			$trad.addAll($e2.trad);
			$trad.add(x.IADD);
			$tipus='I';
			}
		else
			{
			$tipus='E';
			}
		}           
           )?
	;
 
e3 returns [Vector<Long> trad, char tipus] :
            (NOT ee=e)
		{
		if ($ee.tipus=='Z')
			{
			$trad=$ee.trad;
			$trad.add(x.IFEQ);
	   		Long salt=8L;
	   		$trad.add(x.nByte(salt,2));
	   		$trad.add(x.nByte(salt,1));
			$trad.add(x.BIPUSH);
			$trad.add(0L);
			$trad.add(x.GOTO);
	   		salt=5L;
	   		$trad.add(x.nByte(salt,2));
	   		$trad.add(x.nByte(salt,1));
			$trad.add(x.BIPUSH);
			$trad.add(1L);	   		
			$tipus='Z';
			}
		else
			{
			$tipus='E';
			}
		}
	| n=NUM 
		{
		$trad.add(x.BIPUSH);
		$trad.add(new Long($n.text));
		$tipus='I';
		}
	| i=ID
		{
		if (TS.existeix($i.text))
			{
			Registre r=(Registre)TS.obtenir($i.text);
			$trad.add(x.ILOAD);
			$trad.add(new Long(r.getAdreca()));
			$tipus='I';
			}
		else
			{
			errorsem=true;
			$tipus='E';
			}
		}
	| READ
		{	
	   	$trad.add(x.INVOKESTATIC);
	   	$trad.add(x.nByte(x.mGetInt,2));
	   	$trad.add(x.nByte(x.mGetInt,1));
	   	$tipus='I';
		}
        | PO ee=e PT 
        {
         $trad=$ee.trad;
         $tipus=$ee.tipus;
        }	

	;




















