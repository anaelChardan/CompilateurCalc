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
}
