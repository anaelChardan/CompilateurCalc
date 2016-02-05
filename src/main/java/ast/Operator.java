package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Operator {
    PLUS( "+" ),
    MINUS( "-" ),
    TIMES( "*" ),
    DIVIDE( "/" ),
    INFERIOR( "<" ),
    INFERIOREQUAL("<="),
    GREATEREQUAL(">="),
    GREATER(">"),
    NOTEQUALS( "!=" ),
    EQUALS( "==" ),
    AND("&&"),
    OR( "||" );

    private final String op;

    private Operator(final String op ) {
        this.op = op;
    }

    public static Operator fromString(String op){
        return Arrays.asList(Operator.values())
                .stream()
                .filter(e -> op.equalsIgnoreCase(e.op))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(op + " is not value of Operator"));
    }

    @Override
    public String toString() {
        return this.op;
    }

    public static List<Operator> getOnlyBoolOperators()
    {
        List<Operator> boolOperators = new ArrayList<>();
        boolOperators.add(AND);
        boolOperators.add(OR);
        return boolOperators;
    }

    public static List<Operator> getOnlyArithmeticOperators()
    {
        List<Operator> arithmeticsOperators = new ArrayList<>();
        arithmeticsOperators.add(PLUS);
        arithmeticsOperators.add(MINUS);
        arithmeticsOperators.add(TIMES);
        arithmeticsOperators.add(DIVIDE);
        return arithmeticsOperators;
    }

    public static List<Operator> getArithmeticComparisonOperator()
    {
        List<Operator> arithmeticsComparisonOperators = new ArrayList<>();
        arithmeticsComparisonOperators.add(INFERIOR);
        arithmeticsComparisonOperators.add(INFERIOREQUAL);
        arithmeticsComparisonOperators.add(GREATER);
        arithmeticsComparisonOperators.add(GREATEREQUAL);
        return arithmeticsComparisonOperators;
    }

    public static List<Operator> getCommonOperators()
    {
        List<Operator> commonOperators = new ArrayList<>();
        commonOperators.add(NOTEQUALS);
        commonOperators.add(EQUALS);
        return commonOperators;
    }
}
