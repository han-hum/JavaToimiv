package week6;

import java.util.Arrays;

public class ex98 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change copies
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }
    public static int[] copy(int[] array) {
        if (array == null) {
            return null; // Return null for null input
        }
        // Create a new array of the same length as the input array
        int[] newArray = new int[array.length];
        // Copy elements from the original array to the new array
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
