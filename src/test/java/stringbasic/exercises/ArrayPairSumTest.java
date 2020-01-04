package stringbasic.exercises;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayPairSumTest {
    @Test
    public void testGetPairsEmpty() {
        ArrayPairSum arrayPairSum = new ArrayPairSum(10);
        Pair[] expected = new Pair[0];
        int[] emptyArray = {};
        assertArrayEquals("expecting empty array", expected, arrayPairSum.getPairs(emptyArray));
    }

    @Test
    public void testGetPairsOnePair() {
        ArrayPairSum arrayPairSum = new ArrayPairSum(10);
        Pair[] expected = new Pair[] {new Pair(3,7)};
        int[] testArray = {1,6,3,5,7};
        assertArrayEquals("one pair expected", expected, arrayPairSum.getPairs(testArray));
    }

    @Test
    public void testGetPairsMultiplePairs() {
        ArrayPairSum arrayPairSum = new ArrayPairSum(10);
        Pair[] expected = new Pair[] {new Pair(3,7), new Pair(6,4), new Pair(5,5)};
        int[] testArray = {3,1,6,4,5,7,5};
        assertArrayEquals("one pair expected", expected, arrayPairSum.getPairs(testArray));
    }

    @Test
    public void testGetPairsNegativeNumbers() {
        ArrayPairSum arrayPairSum = new ArrayPairSum(10);
        Pair[] expected = new Pair[] {new Pair(-3,13), new Pair(24,-14), new Pair(5,5)};
        int[] testArray = {-3,1,24,-14,5,13,5};
        assertArrayEquals("one pair expected", expected, arrayPairSum.getPairs(testArray));
    }
}
