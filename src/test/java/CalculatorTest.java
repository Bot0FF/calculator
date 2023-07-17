
import org.junit.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator(2, 2, '+');
        Assert.assertEquals(4, calculator.calculateResult(), 0);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator(2, 2, '-');
        Assert.assertEquals(0, calculator.calculateResult(), 0);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator(2, 2, '*');
        Assert.assertEquals(4, calculator.calculateResult(), 0);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator(2, 2, '-');
        Assert.assertEquals(0, calculator.calculateResult(), 0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testArithmeticException() {
        Calculator calculator = new Calculator(2, 0, '/');
        Assert.assertEquals(calculator.calculateResult(), 0);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testNullPointerExceptionAction() {
        Calculator calculator = new Calculator(2, 2, 'a');
        Assert.assertEquals(calculator.calculateResult(), 0);
    }
}
