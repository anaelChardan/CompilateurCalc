package ast;

import java.util.List;

public class IntLit extends Expression {
	public int value;

	public IntLit(int value) {
		this.value = value;
	}

	@Override
	public String gen(int padding) {
		return this.getSpaceFromPadding(padding) + Integer.toString(value);
	}


	@Override
	public PrimitiveType getType(List<Definition> definitions) throws UncompatibleTypeException {
		return PrimitiveType.INT;
	}

	@Override
	protected void checkErrors(List<Definition> definitions) throws UncompatibleTypeException {}
}
