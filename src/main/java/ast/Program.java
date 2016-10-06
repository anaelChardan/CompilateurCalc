package ast;

import java.util.List;

public class Program extends AST {
	protected List<FunctionDefinition> functions;
	protected Body body;

	public Program(Body body, List<FunctionDefinition> functions) {
		this.body = body;
		this.functions = functions;
	}

	public String gen(int padding) throws UncompatibleTypeException {
		StringBuilder builder = new StringBuilder();
		builder.append("#include <stdio.h>\n");
		builder.append("#include <stdbool.h>\n");
		builder.append("\n");
		builder.append(this.body.gen(0));
		return builder.toString();
	}

	protected void checkErrors() throws UncompatibleTypeException {
		for ( FunctionDefinition function : functions) {
			this.checkErrors();
		}
	}
}
