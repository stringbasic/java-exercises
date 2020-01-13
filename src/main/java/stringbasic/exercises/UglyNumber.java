package stringbasic.exercises;

public class UglyNumber {

    private int number;

    public UglyNumber(int number) {
        this.number = number;
    }

    public boolean isUgly() {
        if (this.number == 1)
            return true;
        canDivide(2);
        canDivide(3);
        canDivide(5);

        return this.number == 1;
    }

    private void canDivide(int d) {
        while (this.number % d == 0)
            this.number = this.number/d;
    }
}
