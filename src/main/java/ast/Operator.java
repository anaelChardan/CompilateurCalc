package ast;

import error.SyntaxError;

import java.util.Arrays;

public enum Operator {
    PLUS( "+" ),
    MINUS( "-" ),
    TIMES( "*" ),
    DIVIDE( "/" ),
    EQUALS( "==" ),
    INFERIOR( "<" );

    private final String op;

    private Operator(final String op ) {
        this.op = op;
    }

    public static Operator fromString(String op){
        return Arrays.asList(Operator.values())
                .stream()
                .filter(e -> op.equalsIgnoreCase(e.op))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(op + " is not value of Operator"));
    }

    @Override
    public String toString() {
        return this.op;
    }
}
