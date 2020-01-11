package stringbasic.exercises;

public class AbundantNumber {

    private int number;

    public AbundantNumber(int number) {
        this.number = number;
    }

    public int abundance() {
        int result = 0;
        for (int i = this.number-1; i>0; i--) {
            if (this.number % i == 0)
                result += i;
        }

        return result;
    }

    public boolean isAbundant() {
        return this.abundance() > this.number;
    }
}