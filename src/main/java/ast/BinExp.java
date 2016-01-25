package ast;

public class BinExp {
    Expression expression1;
    Op operator;
    Expression expression2;

    public BinExp(Expression expression1, Op op, Expression expression2) {
        this.expression1 = expression1;
        this.operator = op;
        this.expression2 = expression2;
    }
}
