grammar CCalc;

// syntactic rules

program  : body
         ;
body     : expression
         ;
expression : INTLIT     # IntLit
           ;

// lexical rules

INTLIT   : '0' | ('1'..'9')('0'..'9')*  
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
