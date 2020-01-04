package stringbasic.exercises;

import java.util.ArrayList;

/**
 * Finds pair in an array which sum equals to a given value
 */
public class ArrayPairSum<T> {

    private int sum;

    /**
     *
     * @param sum sum value to look for
     */
    public ArrayPairSum(int sum) {
        this.sum = sum;
    }

    public Pair[] getPairs(int[] elements) {
        ArrayList<Pair> results = new ArrayList<Pair>();
        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if (elements[i] + elements[j] == this.sum) {
                    results.add(new Pair(elements[i], elements[j]));
                }
            }
        }

        return results.toArray(new Pair[0]);
    }
}
