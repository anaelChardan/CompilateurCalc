package ast;

public class StateBuffer {
    /** Constructeur privé */
    private StateBuffer()
    {}

    /** Instance unique pré-initialisée */
    private static StateBuffer INSTANCE = new StateBuffer();

    private static State<PrimitiveType> definitionsType = new State<PrimitiveType>();

    public static StateBuffer getInstance() { return INSTANCE; }

    public State<PrimitiveType> getDefinitions() {
        return definitionsType;
    }
}
