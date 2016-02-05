package ast;

import java.util.List;

public abstract class Expression extends AST {

    public abstract PrimitiveType getType(List<Definition> definitions) throws UncompatibleTypeException;

    protected void checkType(List<Definition> definitions) throws UncompatibleTypeException {
        this.getType(definitions);
    }

    abstract protected void checkErrors(List<Definition> definitions) throws UncompatibleTypeException;
}
