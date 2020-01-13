package stringbasic.exercises;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

@RunWith(Parameterized.class)
public class UglyNumberTest {

    private int number;
    private boolean isUgly;

    @Parameters
    public static Collection<Object[]> uglyNumbers () {
        return ImmutableList.of(
                new Object[] {12, true},
                new Object[] {11, false},
                new Object[] {10, true},
                new Object[] {9, true},
                new Object[] {8, true},
                new Object[] {7, false},
                new Object[] {6, true},
                new Object[] {5, true},
                new Object[] {4, true},
                new Object[] {3, true},
                new Object[] {2, true},
                new Object[] {1, true}
        );
    }

    public UglyNumberTest(int number, boolean isUgly) {
        this.number = number;
        this.isUgly = isUgly;
    }

    @Test
    public void testIsUgly() {
        UglyNumber sut = new UglyNumber(this.number);
        Assert.assertEquals(
            String.format(
                "%d:",
                this.number
            ),
            this.isUgly,
            sut.isUgly()
        );
    }
}
