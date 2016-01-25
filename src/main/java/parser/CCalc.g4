grammar CCalc;

// syntactic rules

program  : body
         ;
body     : expression
         ;
expression : INTLIT                         # IntLit
           | BOOLIT                         # BooLit
           | '(' expression ')'             # ParExp
           | expression OPERATOR expression # BinExp
           ;

// lexical rules

OPERATOR : '+' | '-'
         ;

BOOLIT  : 'true' | 'false'
        ;
INTLIT   : '0' | ('1'..'9')('0'..'9')*  
         ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
