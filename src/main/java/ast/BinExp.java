package ast;

public class BinExp {
    Expression expression1;
    Operator operator;
    Expression expression2;

    public BinExp(Expression expression1, Operator operator, Expression expression2) {
        this.expression1 = expression1;
        this.operator = operator;
        this.expression2 = expression2;
    }
}
