package ast;

public class BooLit extends Expression {
    public boolean value;

    public BooLit(boolean value) {
        this.value = value;
    }

    @Override
    public String gen(int padding) {
        return this.getSpaceFromPadding(padding) + Boolean.toString(value);
    }
}
