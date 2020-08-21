package Logic.Operands.BinaryOperands;

import Logic.Expression;
import Logic.Operands.Operand;

public class Sum extends Operand {
    private Expression secondValue;

    public Sum(Expression _firstValue, Expression _secondValue) {
        super("");
        this.firstValue = _firstValue;
        this.secondValue = _secondValue;
    }

    @Override
    public double getValue() throws Exception {
        return this.firstValue.getValue() + this.secondValue.getValue();
    }

    @Override
    public double deriv() throws Exception {
        return (firstValue.deriv() + secondValue.deriv());
    }
}
