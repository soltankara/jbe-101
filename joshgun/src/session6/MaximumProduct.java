package session6;

/* Write a Java program to find the maximum product of
two integers in a given array of integers.
 */
public class MaximumProduct {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, -7, 5, 8, -5};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int max2 = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != max) {
                if (array[i] > max2) {
                    max2 = array[i];
                }
            }
        }
        System.out.println("Pair is (" + max2 + ", " + max + ") " + " Maximum product: " + (max * max2));
    }
}
