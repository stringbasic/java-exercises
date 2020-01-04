package stringbasic.exercises;

import java.util.Arrays;

/**
 * Moves all zeros in an array to the end
 */
public class ArrayZeroTail {
    public static int[] moveZeros(int [] elements) {
        int [] result = Arrays.copyOf(elements, elements.length);
        for (int i = 0, j = -1; i < result.length; i++) {
            if (result[i] != 0 && i>j && j>=0) {
                /* switch with last 0 found */
                result[j] = result[i];
                result[i] = 0;
                j++;
            } else if (result[i] == 0 && j<0) {
                /* first 0 element */
                j=0;
            }
        }

        return result;
    }
}
