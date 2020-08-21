package Logic.Operands.BinaryOperands;

import Logic.Expression;
import Logic.Operands.Operand;

public class Pow extends Operand {
    private Expression secondValue;

    public Pow(Expression _firstValue, Expression _secondValue) {
        super("");
        this.firstValue = _firstValue;
        this.secondValue = _secondValue;
    }

    @Override
    public double getValue() throws Exception {
        return Math.pow(firstValue.getValue(), secondValue.getValue());
    }

    @Override
    public double deriv() throws Exception {
        return secondValue.getValue() * (Math.pow(firstValue.getValue(), secondValue.getValue() - 1)) * firstValue.deriv();
    }
}
