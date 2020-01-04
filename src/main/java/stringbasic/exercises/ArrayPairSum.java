package stringbasic.exercises;

import java.util.ArrayList;

/**
 * Finds pair in an array which sum equals to a given value
 */
public class ArrayPairSum {

    private int sum;

    /**
     *
     * @param sum sum value to look for
     */
    public ArrayPairSum(int sum) {
        this.sum = sum;
    }

    public IntPair[] getPairs(int[] elements) {
        ArrayList<IntPair> results = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if (elements[i] + elements[j] == this.sum) {
                    results.add(new IntPair(elements[i], elements[j]));
                }
            }
        }

        return results.toArray(new IntPair[0]);
    }
}
