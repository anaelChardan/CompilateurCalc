package ast;

public class UnaryExp extends Expression {
    Expression expression;

    public UnaryExp(Expression expression) {
        this.expression = expression;
    }
}
