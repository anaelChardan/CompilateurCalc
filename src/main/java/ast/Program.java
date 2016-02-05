package ast;

public class Program extends AST {
	public Body body;

	public Program(Body body) {
		this.body = body;
	}

	public String gen(int padding) throws UncompatibleTypeException {
		StringBuilder builder = new StringBuilder();
		builder.append("#include <stdio.h>\n");
		builder.append("#include <stdbool.h>\n");
		builder.append("\n");
		builder.append(this.body.gen(0));
		return builder.toString();
	}
}
