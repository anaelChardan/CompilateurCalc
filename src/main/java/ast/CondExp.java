package ast;

import java.util.List;

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
    public String gen(int padding) throws UncompatibleTypeException {
        String space = this.getSpaceFromPadding(padding);
        return space + this.expression1.gen(0) + " ? " + expression2.gen(0) + " : " + expression3.gen(0);

    }

    @Override
    public PrimitiveType getType(List<Definition> definitions) throws UncompatibleTypeException {
        return expression2.getType(definitions);
    }

    @Override
    protected void checkErrors(List<Definition> definitions) throws UncompatibleTypeException {
        expression1.checkErrors(definitions);
        expression2.checkErrors(definitions);
        expression3.checkErrors(definitions);

        if (expression1.getType(definitions) != PrimitiveType.BOOL)
        {
            throw new UncompatibleTypeException("You can't use an int expression on a conditionnal statement");
        }

        if (expression2.getType(definitions) != expression3.getType(definitions))
        {
            throw new UncompatibleTypeException("You can't used different returned type");
        }
    }
}