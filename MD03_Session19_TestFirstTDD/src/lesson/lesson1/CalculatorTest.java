package lesson.lesson1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
Calculator calculator=new Calculator();
    @Before
    public void setUp() throws Exception {
        System.out.println("Testing start!");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Testing done!");
    }

    @Test
    public void add() {
        int a=5;
        int b=7;
        Assert.assertEquals(12,calculator.add(a,b),0);
        Assert.assertEquals(-1,calculator.add(a,b),0);
        Assert.assertEquals(0,calculator.add(a,b),0);
    }

    @Test
    public void subtract() {
        int a=7;
        int b=3;
        Assert.assertEquals(4,calculator.subtract(a,b),0);
        Assert.assertEquals(-1,calculator.subtract(a,b),0);
        Assert.assertEquals(0,calculator.subtract(a,b),0);
    }
}