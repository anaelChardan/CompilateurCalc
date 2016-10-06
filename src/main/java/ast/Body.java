package ast;

import java.util.List;

public class Body extends AST {
	public List<Definition> definitions;
	public Expression expr;

	public Body(Expression expr, List<Definition> definitions) {
		this.expr = expr;
		this.definitions = definitions;
	}

	@Override
	public String gen(int padding) throws UncompatibleTypeException {
		StringBuilder sb = new StringBuilder();
		sb.append("int main () { \n");

		if (definitions != null) {
			String typeDef = "";
			int increment = 0;

			for (Definition def : definitions) {
				typeDef = def.getType(definitions.subList(0, increment)) == PrimitiveType.BOOL ? "bool" : "int";
				increment++;
				sb.append(this.getSpaceFromPadding(4) + typeDef + " " + def.gen(0));
			}
		}

		sb.append(this.getSpaceFromPadding(4));
		sb.append("return printf(\"%i\", " + expr.gen(padding) + "); \n }");

		return sb.toString();
	}

	protected void checkErrors(List<FunctionDefinition> functions) throws UncompatibleTypeException
	{
		if (definitions != null) {
			int increment = 0;
			for (Definition def : definitions) {
				def.checkErrors(definitions.subList(0, increment));
				increment++;
			}
		}

		this.expr.checkErrors(this.definitions, functions);
	}

	public PrimitiveType getType(List<Definition> definitions, List<FunctionDefinition> functions)
	{
		return expr.getType(definitions, functions);
	}

}
