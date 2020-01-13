package stringbasic.exercises;

import org.junit.Assert;
import org.junit.Test;

public class UglyNumberTest {

    @Test
    public void testIsUgly() {
        int number = 1;
        UglyNumber sut = new UglyNumber(number);
        Assert.assertTrue(String.format("%d:", number), sut.isUgly());
    }
}
