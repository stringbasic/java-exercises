package stringbasic.exercises;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

@RunWith(Parameterized.class)
public class AbundantNumberTest {

    private int number;
    private int abundance;
    private boolean isAbundant;

    @Parameters
    public static Collection<Object[]> abundantNumbers () {
        return ImmutableList.of(
                new Object[] {10, 8, false},
                new Object[] {12, 16, true},
                new Object[] {18, 21, true},
                new Object[] {20, 22, true},
                new Object[] {21, 11, false},
                new Object[] {24, 36, true},
                new Object[] {30, 42, true}
        );
    }

    public AbundantNumberTest(int number, int abundance, boolean isAbundant) {
        this.number = number;
        this.abundance = abundance;
        this.isAbundant = isAbundant;
    }

    @Test
    public void testKnownCases() {
        AbundantNumber sut = new AbundantNumber(this.number);
        Assert.assertEquals(this.abundance, sut.abundance());
        Assert.assertEquals(this.isAbundant, sut.isAbundant());
    }
}