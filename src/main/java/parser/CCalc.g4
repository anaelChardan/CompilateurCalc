grammar CCalc;

// syntactic rules

program  : body
         ;
body     : expression
         ;
expression : INTLIT             # IntLit
           | BOOLEAN            # Boolean
           ;

// lexical rules
BOOLEAN  : 'true' | 'false'
         ;

INTLIT   : '0' | ('1'..'9')('0'..'9')*  
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
