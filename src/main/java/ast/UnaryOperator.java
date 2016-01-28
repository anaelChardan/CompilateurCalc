package ast;

import java.util.Arrays;

public enum UnaryOperator {
    MINUS( "-" ),
    NOT( "!" );

    private final String op;

    private UnaryOperator(final String op ) {
        this.op = op;
    }

    public static UnaryOperator fromString(String op){
        return Arrays.asList(UnaryOperator.values())
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
