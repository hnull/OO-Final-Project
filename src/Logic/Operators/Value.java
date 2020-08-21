package Logic.Operators;

public class Value extends Operator{
    private double val;

    public Value(double _val) {
        super("");
        val = _val;
    }

    @Override
    public double getValue() throws Exception {
        return val;
    }

    @Override
    public double deriv() throws Exception {
        return 0;
    }
}
