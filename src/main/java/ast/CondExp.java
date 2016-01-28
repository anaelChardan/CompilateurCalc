package ast;

public class CondExp extends Expression {
    Expression expression1;
    Expression expression2;
    Expression expression3;

    public CondExp(Expression expression1, Expression expression2, Expression expression3) {
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.expression3 = expression3;
    }

    @Override
    public String gen(int padding) {
        String space = this.getSpaceFromPadding(padding);

        return space + "if ( " + this.expression1.gen(0) + ") { \n"
                + expression2.gen(padding + 4) + ";\n"
                + space + "} else { \n"
                + expression3.gen(padding + 4) + ";\n"
                + space + "}";

    }
}