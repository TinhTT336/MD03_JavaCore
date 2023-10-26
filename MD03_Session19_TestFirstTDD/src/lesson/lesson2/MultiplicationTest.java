package lesson.lesson2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {
Multiplication multiplication=new Multiplication();
    @Before
    public void setUp() throws Exception {
        System.out.println("Starting!");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Done!");
    }

    @Test
    public void multiply() {
        double a=2.0;
        double b=3.5;
        Assert.assertEquals(7,multiplication.multiply(a,b),0);
    }
}