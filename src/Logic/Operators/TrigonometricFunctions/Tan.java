package Logic.Operators.TrigonometricFunctions;

import Logic.Expression;
import Logic.Operators.Operator;

public class Tan extends Operator {
    Expression exp;

    public Tan(Expression _expr) {
        super("");
        exp = _expr;
    }

    @Override
    public double getValue() throws Exception {
        return Math.tan(exp.getValue());
    }

    @Override
    public double deriv() throws Exception {
        return 1 + (Math.pow(Math.tan(exp.getValue()), 2));
    }
}
