package Tests;

import Logic.Expression;
import Logic.Operands.BinaryOperands.Divide;
import Logic.Operands.BinaryOperands.Minus;
import Logic.Operands.BinaryOperands.Multiply;
import Logic.Operands.UnaryOperands.Log;
import Logic.Operands.UnaryOperands.Sqrt;
import Logic.Operators.TrigonometricFunctions.Cos;
import Logic.Operators.TrigonometricFunctions.Cot;
import Logic.Operators.TrigonometricFunctions.Sin;
import Logic.Operators.Value;
import Logic.Variable;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestLogic {

    @Test
    public void sampleTest() throws Exception {
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Expression exp1 = new Divide(new Minus(new Cos(x), new Value(1)), y);
        y.setValue(2);
        x.setValue(0);
        double deriv1 = exp1.deriv();
        assertTrue(deriv1 == 0);
        x.setValue(Math.PI / 2);
        double deriv2 = exp1.deriv();
        assertTrue(deriv2 == -1.75);
    }

    @Test
    public void basicExpressionsTest() throws Exception {
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Expression exp1 = new Sin(x);
        Expression exp2 = new Cos(y);
        x.setValue(1);
        y.setValue(1);
        assertTrue(exp2.deriv() == (-1) * exp1.getValue());
    }

    @Test
    public void longExpressionTest() throws Exception {
        Variable y = new Variable("y");
        Variable z = new Variable("z");
        Expression exp = new Minus(new Log(z), new Multiply(new Value(500), new Sqrt(new Cot(y))));
        y.setValue(20);
        double deriv = exp.deriv();
        z.setValue(30);
        System.out.println("Expression's value is = " + exp.getValue());
        System.out.println("Derivative of the expression is = " + deriv);
    }
}
