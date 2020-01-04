package stringbasic.exercises;

import java.util.Arrays;

public class SortArray {
    public static void sortIntArray() {
        int[] sample = {10,3,45,6,4,11};
        System.out.println("Unsorted array: "+ Arrays.toString(sample));
        Arrays.sort(sample);
        System.out.println("Sorted array: "+ Arrays.toString(sample));
    }
    public static void sortStringArray() {
        String[] sample = {"test", "hello", "apollo", "buran"};
        System.out.println("Unsorted array: "+ Arrays.toString(sample));
        Arrays.sort(sample);
        System.out.println("Sorted array: "+ Arrays.toString(sample));
    }
}