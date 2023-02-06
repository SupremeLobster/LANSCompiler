grammar calcsem;

@header{
    import java.io.*;

}

@parser::members{
         SymTable<Registre> TS = new SymTable<Registre>(1000);   
         boolean error = false;        
         
         //override method    
         public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {            
              super.notifyErrorListeners(offendingToken,msg,e);            
              error=true;              
         }
}

//Regles Sintactiques

lexpressions 	
	: 	(expr SEMI)+ 
	;
	
expr returns [char tipus]
	:	t1=terme {$tipus=$t1.tipus;}
                (s=(PLUS | MINUS) t2=terme
                 {
                    if($t1.tipus!=$t2.tipus){
                        error=true;
                        System.out.println("Error de tipus detectat a la linia " + $s.line);
                    }
                  }       
                )*;

terme returns [char tipus]
	:	t1=factor {$tipus=$t1.tipus;}
        (s=(STAR | DIV) t2=factor
        {
            if($t1.tipus!=$t2.tipus){
                error=true;
                System.out.println("Error de tipus detectat a la linia " + $s.line);
            }
        }
        )*;

factor returns [char tipus]:	
		a=TK_CONSTANT_ENTERA {
                              $tipus='E'; 
                              if(!TS.existeix($a.text))
                                    TS.inserir($a.text,new Registre($a.text));
                }
	|	b=TK_CONSTANT_REAL {
                            $tipus='R';
                            if(!TS.existeix($b.text))
                                    TS.inserir($b.text,new Registre($b.text));
                }
	|	LPAREN e=expr {$tipus=$e.tipus;} RPAREN	
	;


//Regles Lexiques


WS	:	(' '
	|	'\t'
	|	'\n'
	|	'\r')+ -> skip
	;

LPAREN:	'(' 
	;

RPAREN:	')' 
	;

STAR:	'*' 
	;

DIV: '/';


PLUS:	'+' 
	;
	
MINUS: '-' 
	;

SEMI:	';' 
	;
	
fragment
DIGIT
	:	'1'..'9'
	;	




TK_CONSTANT_REAL
	:	
		DIGIT (DIGIT | '0')* '.' (DIGIT |'0')+  

	;

TK_CONSTANT_ENTERA
	:	
		DIGIT (DIGIT | '0')* 
	;
