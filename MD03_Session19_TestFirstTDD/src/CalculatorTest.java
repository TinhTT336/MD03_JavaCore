import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
private Calculator calculator;
    @Before
    public void setUp() throws Exception {
        System.out.println("Setup test");
        calculator=new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Testing done!!!");
    }

    @Test
    public void add() {
        double a=1.2;
        double b=1.5;

        Assert.assertEquals(2.7,calculator.add(a,b),0);
    }

    @Test
    public void multiply() {
        double a=3.0;
        double b=1.5;

        Assert.assertEquals(4.5,calculator.multiply(a,b),0);
    }

    @Test
    public void divide() {
        double a=5.2;
        double b=2.0;

        Assert.assertTrue(calculator.divide(a,b)==2.6);
    }
    @Test
    public void falseDivide(){
        double a=3.0;
        double b=3.0;

        Assert.assertNotEquals(0.5,calculator.divide(a,b),0);
    }
    @Test
    public void divideZero(){
        double a=3.0;
        double b=0.0;

        Assert.assertThrows(ArithmeticException.class,calculator);
    }
}