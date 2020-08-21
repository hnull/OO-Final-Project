package Logic.Operands.UnaryOperands;

import Logic.Expression;
import Logic.Operands.Operand;
import java.lang.Math;

public class Sqrt extends Operand {

    public Sqrt(Expression _firstValue) {
        super("");
        this.firstValue = _firstValue;
    }

    @Override
    public double getValue() throws Exception {
        return Math.sqrt(this.firstValue.getValue());
    }

    @Override
    public double deriv() throws Exception {
        return 0.5 * (Math.pow(firstValue.getValue(), -0.5)) * firstValue.deriv();
    }
}
