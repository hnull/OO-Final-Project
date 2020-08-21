package Logic.Operands;

import Logic.Expression;

public abstract class Operand extends Expression{
    protected Expression firstValue;

    public Operand(String _declaration) {
        super(_declaration);
    }

    public abstract double getValue() throws Exception;

    public abstract double deriv() throws Exception;

}
