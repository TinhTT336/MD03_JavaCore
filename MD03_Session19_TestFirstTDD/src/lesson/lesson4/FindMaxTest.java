package lesson.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxTest {
FindMax findMax=new FindMax();
    @Test
    public void findMax() {
        int[]arr={1,7,0,4,6,8,3};
        Assert.assertTrue(findMax.findMax(arr)==7);
    }
}