package Logic.Operators.TrigonometricFunctions;

import Logic.Expression;
import Logic.Operators.Operator;

public class Sin extends Operator {
    Expression exp;

    public Sin(Expression _expr) {
        super("");
        exp = _expr;
    }

    @Override
    public double getValue() throws Exception {
        return Math.sin(exp.getValue());
    }

    @Override
    public double deriv() throws Exception {
        return Math.cos(exp.getValue());
    }
}
