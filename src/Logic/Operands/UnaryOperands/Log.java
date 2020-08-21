package Logic.Operands.UnaryOperands;

import Logic.Expression;
import Logic.Operands.Operand;
import Logic.Variable;

public class Log extends Operand {

    public Log(Expression _firstValue) {
        super("");
        this.firstValue = _firstValue;
    }


    @Override
    public double getValue() throws Exception {
        return Math.log(firstValue.getValue());
    }

    @Override
    public double deriv() throws Exception {
        return (1 / (firstValue.getValue()));
    }
}
