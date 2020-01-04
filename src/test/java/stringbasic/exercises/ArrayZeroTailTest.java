package stringbasic.exercises;

import org.junit.Assert;
import org.junit.Test;

public class ArrayZeroTailTest {
    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        Assert.assertArrayEquals("expect empty array", emptyArray, ArrayZeroTail.moveZeros(emptyArray));
    }

    @Test
    public void testNoZerosArray() {
        int[] valuesArray = {1,2,4};
        Assert.assertArrayEquals("expect equal array", valuesArray, ArrayZeroTail.moveZeros(valuesArray));
    }

    @Test
    public void testZerosAtEndArray() {
        int[] valuesArray = {1,2,4,0,0};
        Assert.assertArrayEquals("expect equal array", valuesArray, ArrayZeroTail.moveZeros((valuesArray)));
    }

    @Test
    public void testZerosUnsortedArray() {
        int[] valuesArray = {0,1,4,0,2,0};
        int[] originalArray = {0,1,4,0,2,0};
        int[] expectedArray = {1,4,2,0,0,0};
        Assert.assertArrayEquals("expect equal array", expectedArray, ArrayZeroTail.moveZeros((valuesArray)));
        Assert.assertArrayEquals("original array is unchanged", valuesArray, originalArray);
    }
}
