package ast;

import java.util.List;

public class Body extends AST {
	public Expression expr;
	public List<Definition> definitions;

	public Body(Expression expr, List<Definition> definitions) {
		this.expr = expr;
		this.definitions = definitions;
	}

	@Override
	public String gen(int padding) throws UncompatibleTypeException {

		this.checkErrors(definitions);
		this.expr.checkErrors(definitions);

		StringBuilder sb = new StringBuilder();
		sb.append("int main () { \n");

		if (definitions != null) {
			String typeDef = "";
			int increment = 0;

			for (Definition def : definitions) {
				increment++;
				typeDef = def.getType(definitions.subList(0, increment)) == PrimitiveType.BOOL ? "bool" : "int";
				sb.append(this.getSpaceFromPadding(4) + typeDef + " " + def.gen(0));
			}
		}

		sb.append(this.getSpaceFromPadding(4));
		sb.append("return printf(\"%i\", " + expr.gen(padding) + "); \n }");

		return sb.toString();
	}

	protected void checkErrors(List<Definition> definitions) throws UncompatibleTypeException
	{
		if (definitions != null) {
			int increment = 0;
			for (Definition def : definitions) {
				increment++;
				def.checkErrors(definitions.subList(0, increment));
			}
		}
	}

}
