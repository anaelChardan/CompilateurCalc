package ast;

import java.util.Arrays;

public enum PrimitiveType {
    BOOL( "boolean" ),
    INT( "integer" );

    private final String type;

    private PrimitiveType(final String type) {
        this.type = type;
    }

    public static PrimitiveType fromString(String type){
        return Arrays.asList(PrimitiveType.values())
                .stream()
                .filter(e -> type.equalsIgnoreCase(e.type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(type + " is not value of Operator"));
    }

    @Override
    public String toString() {
        return this.type;
    }
}
