package lesson.lesson5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinTest {
FindMin findMin=new FindMin();
    @Test
    public void findMin() {
        int[]arr={1,7,0,4,6,8,3};
        Assert.assertEquals(0,findMin.findMin(arr)==7);
    }
}