package ast;

public enum Op {
    PLUS( "+" ),
    MINUS( "-" ),
    TIMES( "*" ),
    DIVIDE( "/" ),
    EQUALS( "==" ),
    INFERIOR( "<" );

    private final String op;

    private Op(final String op ) {
        this.op = op;
    }

    @Override
    public String toString() {
        return this.op;
    }
}
