package ArrayExercises;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        // 7. Write a Java program to remove a specific element from an array.
        int[] arr1 = {2, 3, 1, 5, 8};
        int[] arr2 = new int[arr1.length - 1];
        int index = 2;
        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (index != i) {
                arr2[j++] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
