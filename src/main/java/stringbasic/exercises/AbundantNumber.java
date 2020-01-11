package stringbasic.exercises;

public class AbundantNumber {

    private int number;

    public AbundantNumber(int number) {
        this.number = number;
    }

    public int abundance() {
        int result = 0;
        for (int i = 1; i <= this.number/2; i++) {
            if (this.number % i == 0)
                result += i;
        }

        return result;
    }

    public boolean isAbundant() {
        return this.abundance() > this.number;
    }
}