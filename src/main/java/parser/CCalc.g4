grammar CCalc;

// syntactic rules

program  : body
         ;
body     : expression
         ;
expression : (MINUS | NOT) expression             # UnaryExp
           | expression (MINUS | OP) expression   # BinExp
           | INTLIT                               # IntLit
           | BOOLIT                               # BooLit
           | '(' expression ')'                   # ParExp
           ;

// lexical rules

INTLIT   : '0' | ('1'..'9')('0'..'9')*  
         ;

BOOLIT   : 'true' | 'false'
         ;

MINUS    : '-'
         ;

NOT      : '!'
         ;

OP       : '+' | '*' | '/' | '==' | '<'
         ;


WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
