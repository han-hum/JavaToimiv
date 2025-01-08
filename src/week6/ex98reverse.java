package week6;

import java.util.Arrays;

public class ex98reverse {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reversed = reverseCopy(original);

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "reversed: " + Arrays.toString(reversed));
    }
    public static int[] reverseCopy(int[] array) {
        if (array == null) {
            return null; // Handle null input
        }

        int[] reversedArray = new int[array.length]; // New array to store reversed elements

        // Fill the reversed array with elements from the original array in reverse order
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        return reversedArray; // Return the reversed array
    }
}
