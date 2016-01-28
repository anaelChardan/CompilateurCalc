grammar CCalc;

// syntactic rules

program  : body EOF
         ;
body     : expression
         ;
expression : (MINUS | NOT) expression                              # UnaryExp
           | expression ('*' | '/') expression                     # BinExp
           | expression ('+' | '-') expression                     # BinExp
           | expression ('<' | '>' | '<=' | '=>') expression       # BinExp
           | expression ('==' | '!=' ) expression                  # BinExp
           | expression '&&' expression                            # BinExp
           | expression '||' expression                            # BinExp
           | expression '?'<assoc=right> expression ':' expression # CondExp
           | INTLIT                                                # IntLit
           | BOOLIT                                                # BooLit
           | '(' expression ')'                                    # ParExp
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
