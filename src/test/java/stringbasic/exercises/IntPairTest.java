package stringbasic.exercises;

import org.junit.Assert;
import org.junit.Test;

public class IntPairTest {

    @Test
    public void testConsistency() {
        IntPair firstPair = new IntPair(2,4);
        IntPair equalPair = new IntPair(2,4);
        IntPair differentPair = new IntPair(3,5);
        Assert.assertTrue(firstPair.equals(equalPair));
        Assert.assertEquals(firstPair.hashCode(), equalPair.hashCode());
        Assert.assertTrue(firstPair.equals(firstPair));
        Assert.assertEquals(firstPair.hashCode(), firstPair.hashCode());
        Assert.assertFalse(firstPair.equals(differentPair));
        Assert.assertNotEquals(firstPair.hashCode(), differentPair.hashCode());
        Assert.assertFalse(firstPair.equals(null));
        Assert.assertFalse(firstPair.equals("not a pair"));
    }
}
