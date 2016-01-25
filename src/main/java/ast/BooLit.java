package ast;

public class BooLit extends Expression {
    public boolean value;

    public BooLit(boolean value) {
        this.value = value;
    }
}
