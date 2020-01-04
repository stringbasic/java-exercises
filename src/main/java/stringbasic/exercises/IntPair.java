package stringbasic.exercises;

/**
 * Pair container for int elements
 */
public class IntPair {

    private int first;
    private int second;

    public IntPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntPair intPair = (IntPair) o;
        return getFirst() == intPair.getFirst() &&
                getSecond() == intPair.getSecond();
    }
}
