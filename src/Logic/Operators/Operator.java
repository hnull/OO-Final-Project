package Logic.Operators;

import Logic.Expression;

public abstract class Operator extends Expression {
    public Operator(String _declaration) {
        super(_declaration);
    }

    public abstract double getValue() throws Exception;

    public abstract double deriv() throws Exception;
}
