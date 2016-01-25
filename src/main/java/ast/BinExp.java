package ast;

public class BinExp extends Expression{
    Expression expression1;
    Operator operator;
    Expression expression2;

    public BinExp(Expression expression1, Operator op, Expression expression2) {
        this.expression1 = expression1;
        this.operator = op;
        this.expression2 = expression2;
    }
}
