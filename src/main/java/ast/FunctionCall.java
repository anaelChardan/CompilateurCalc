package ast;

import java.util.List;

public class FunctionCall extends Expression {
    String calledFunction;
    List<Expression> expressions;

    public FunctionCall(String calledFunction, List<Expression> expressions) {
        this.calledFunction = calledFunction;
        this.expressions = expressions;
    }

    @Override
    public PrimitiveType getType(List<Definition> definitions, List<FunctionDefinition> functions) throws UncompatibleTypeException {
        FunctionDefinition correspondedfunc = null;
        for (FunctionDefinition functionDefinition : functions)
        {
            if (functionDefinition.getName().equals(this.calledFunction))
            {
                correspondedfunc = functionDefinition;
            }
        }
        return correspondedfunc.getType(definitions, functions);
    }

    @Override
    protected void checkErrors(List<Definition> definitions, List<FunctionDefinition> functions) throws UncompatibleTypeException {
        Boolean functionExist = false;
        for (FunctionDefinition functionDefinition : functions)
        {
            if (functionDefinition.getName().equals(this.calledFunction))
            {
                functionExist = true;
            }
        }
        if (!functionExist)
        {
            throw new RuntimeException("Try to call not exist function");
        }
        for (Expression expression : expressions)
        {
            expression.checkErrors(definitions, functions);
        }
    }


    @Override
    public String gen(int padding) throws UncompatibleTypeException {
        return null;
    }
}
