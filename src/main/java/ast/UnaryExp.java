package ast;

public class UnaryExp extends Expression {
    UnaryOperator unaryop;
    Expression expression;


    public UnaryExp(UnaryOperator operator, Expression expression) {
        this.expression = expression;
        this.unaryop = operator;
    }

    @Override
    public String gen(int padding) {
        return this.getSpaceFromPadding(padding) + unaryop.toString() + " " + expression.gen(0);
    }
}
