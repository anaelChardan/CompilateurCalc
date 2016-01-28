package ast;

public class Body extends AST {
	public Expression expr;

	public Body(Expression expr) {
		this.expr = expr;
	}

	@Override
	public String gen(int padding) {
		return "int main () { \n" + this.getSpaceFromPadding(4) + "return printf(\"%i\", " + expr.gen(padding) + "); \n }";
	}
}
