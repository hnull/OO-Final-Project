package Logic;

public class Expression {
    protected String declaration;
    private double value;
    private double deriv;

    public Expression(String _declaration) {
        declaration = _declaration;
    }

    public double getValue() throws Exception {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double deriv() throws Exception {
        return deriv;
    }
}
