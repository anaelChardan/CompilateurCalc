package ast;

import java.util.List;

public class Definition extends AST {
    public String variable;
    public Expression expression;

    public Definition(String variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public String gen(int padding) throws UncompatibleTypeException {
        return getSpaceFromPadding(padding) + this.variable + " = " + this.expression.gen(0) + ";\n";
    }

    public PrimitiveType getType(List<Definition> definitions) throws UncompatibleTypeException {
        return this.expression.getType(definitions);
    }

    protected void checkErrors(List<Definition> definitions) throws UncompatibleTypeException {
        this.expression.checkErrors(definitions);

        for (Definition definition : definitions)
        {
            if (definition.variable.equals(variable))
            {
                throw new RuntimeException("Try to redifine a variable");
            }
        }
    }
}
