package stringbasic.exercises;

import java.util.Objects;

/**
 * Pair container for int elements
 */
public class Pair {

    private int first;
    private int second;

    public Pair() {

    }

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return getFirst() == pair.getFirst() &&
                getSecond() == pair.getSecond();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond());
    }
}
