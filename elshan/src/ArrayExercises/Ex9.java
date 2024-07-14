package ArrayExercises;

import java.util.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        // 9. Write a Java program to insert an element (specific position) into an array.
        int[] arr = {2, 3, 1, 5, 8};
        int index = 1;
        int value = 9;

        for (int i = arr.length -1 ; i < index ; i--) {
            arr[i] = arr[i-1];
        }
        arr [index] = value;

        System.out.println(Arrays.toString(arr));
    }
}
