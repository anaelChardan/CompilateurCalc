grammar CCalc;

// syntactic rules

program  : function* body EOF
         ;

function : head body
         ;
head     : FUNCTION_identifier '(' ((VARIABLE ',')* VARIABLE?) ')'
         ;
body     : definition* expression
         ;
definition : VARIABLE '=' expression
           ;
expression : ('-' | '!') expression                                      # UnaryExp
           | expression ('*' | '/') expression                           # BinExp
           | expression ('+' | '-') expression                           # BinExp
           | expression ('<' | '>' | '<=' | '=>') expression             # BinExp
           | expression ('==' | '!=' ) expression                        # BinExp
           | expression '&&' expression                                  # BinExp
           | expression '||' expression                                  # BinExp
           | expression '?'<assoc=right> expression ':' expression       # CondExp
           | INTLIT                                                      # IntLit
           | BOOLIT                                                      # BooLit
           | FUNCTION_identifier '(' ((expression ',')* expression?) ')' #FunctionCall
           | VARIABLE                                                    # VariaLit
           | '(' expression ')'                                          # ParExp
           ;

// lexical rules
INTLIT   : '0' | ('1'..'9')('0'..'9')*  
         ;

BOOLIT   : 'true' | 'false'
         ;

VARIABLE : ('a'..'z')('a'..'z'|'0'..'9')*
         ;

FUNCTION_identifier : ('a'..'z')('a'..'z'|'0'..'9')*
                    ;

WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
