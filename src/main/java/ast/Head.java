package ast;

import java.util.List;

public class Head extends AST {
    String functionName;
    List<String> variables;

    public Head(String functionName, List<String> variables) {
        this.functionName = functionName;
        this.variables = variables;
    }

    @Override
    public String gen(int padding) throws UncompatibleTypeException {
        return null;
    }

    public String getName()
    {
        return this.functionName;
    }

    public int getArity()
    {
        return this.variables.size();
    }
}
