package ast;

import java.util.List;

public class VarialIt extends Expression {

    public String value;

    public VarialIt(String value) {
        this.value = value;
    }

    @Override
    public String gen(int padding) throws UncompatibleTypeException {
        return this.getSpaceFromPadding(padding) + value;
    }

    @Override
    public PrimitiveType getType(List<Definition> definitions) throws UncompatibleTypeException {
        Definition correspondedDef = null;
        for (Definition definition : definitions)
        {
            if (definition.variable.equals(value))
            {
                correspondedDef = definition;
            }
        }
        return correspondedDef.getType();
    }

    @Override
    protected void checkErrors(List<Definition> definitions) throws UncompatibleTypeException {
        //Check if the definitions exists
        for (Definition definition : definitions)
        {
            if (definition.variable.equals(value))
            {
                return;
            }
        }

        throw new RuntimeException("Try to use undeclared definition");
    }
}
