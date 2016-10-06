package ast;

import java.util.List;

public class FunctionDefinition extends AST {
    Head  head;
    Body  body;

    public FunctionDefinition(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public String gen(int padding) throws UncompatibleTypeException {
        return null;
    }

    public String getName()
    {
        return this.head.getName();
    }

    protected void checkErrors(List<FunctionDefinition> functions) throws UncompatibleTypeException {

    }

    public PrimitiveType getType(List<Definition> definitions, List<FunctionDefinition> functions) {
        return this.body.getType(definitions, functions);
    }

    public int getArity()
    {
        return this.head.getArity();
    }
}
