package ast;

import java.util.List;

public class BooLit extends Expression {
    public boolean value;

    public BooLit(boolean value) {
        this.value = value;
    }

    @Override
    public String gen(int padding) {
        return this.getSpaceFromPadding(padding) + Boolean.toString(value);
    }


    @Override
    public PrimitiveType getType(List<Definition> definitions, List<FunctionDefinition> functions) throws UncompatibleTypeException {
        return PrimitiveType.BOOL;
    }

    @Override
    protected void checkErrors(List<Definition> definitions, List<FunctionDefinition> functions) throws UncompatibleTypeException {}
}
