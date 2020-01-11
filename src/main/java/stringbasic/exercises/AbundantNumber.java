package stringbasic.exercises;

public class AbundantNumber {

    private int number;

    public AbundantNumber(int number) {
        this.number = number;
    }

    public int abundance() {
        int result = 0;
        for (int i = 1; i <= Math.sqrt(this.number); i++) {
            if (this.number % i == 0) {
                result += i;
                if (this.number / i != i)
                    result += this.number / i;
            }
        }

        return result - this.number;
    }

    public boolean isAbundant() {
        return this.abundance() > this.number;
    }
}