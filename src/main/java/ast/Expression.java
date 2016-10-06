package ast;

import java.util.List;

public abstract class Expression extends AST {

    public abstract PrimitiveType getType(List<Definition> definitions, List<FunctionDefinition> functions) throws UncompatibleTypeException;

    abstract protected void checkErrors(List<Definition> definitions, List<FunctionDefinition> functions) throws UncompatibleTypeException;
}
