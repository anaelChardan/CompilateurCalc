package ast;

import java.util.List;

public class ParExp extends Expression {
    Expression expression;

    public ParExp(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String gen(int padding) throws UncompatibleTypeException {

        return "( " + expression.gen(0) + ")";
    }

    @Override
    public PrimitiveType getType(List<Definition> definitions, List<FunctionDefinition> functions) throws UncompatibleTypeException {
        return expression.getType(definitions, functions);
    }

    @Override
    protected void checkErrors(List<Definition> definitions, List<FunctionDefinition> functions) throws UncompatibleTypeException {
        this.expression.checkErrors(definitions, functions);
    }
}
