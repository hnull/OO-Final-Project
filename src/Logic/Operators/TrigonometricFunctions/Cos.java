package Logic.Operators.TrigonometricFunctions;

import Logic.Expression;
import Logic.Operators.Operator;

public class Cos extends Operator {
    Expression exp;

    public Cos(Expression _expr) {
        super("");
        exp = _expr;
    }

    @Override
    public double getValue() throws Exception {
        return Math.cos(exp.getValue());
    }

    @Override
    public double deriv() throws Exception {
        return (-1) * Math.sin(exp.getValue());
    }
}
