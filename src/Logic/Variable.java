package Logic;

public class Variable extends Expression {

    public Variable(String _declaration) {
        super(_declaration);
    }

    @Override
    public double deriv() throws Exception {
        return 1;
    }
}
