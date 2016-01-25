package ast;

public class ParExp extends Expression {
    Expression expression;

    public ParExp(Expression expression) {
        this.expression = expression;
    }
}
