package Logic.Operators.TrigonometricFunctions;

import Logic.Expression;
import Logic.Operators.Operator;

public class Cot extends Operator {
    Expression exp;

    public Cot(Expression _expr) {
        super("");
        exp = _expr;
    }

    @Override
    public double getValue() throws Exception {
        return 1 / Math.tan(exp.getValue());
    }

    @Override
    public double deriv() throws Exception {
        return (-1) - (Math.pow(1 / Math.tan(exp.getValue()), 2));
    }

}
