package ast;

public class ParExp extends Expression {
    Expression expression;

    public ParExp(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String gen(int padding) {
        return "( " + expression.gen(0) + ")";
    }
}
