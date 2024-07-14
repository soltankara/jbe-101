package ArrayExercises;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        // 7. Write a Java program to remove a specific element from an array.
        int[] arr = {2, 3, 1, 5, 8};
        int index = 1;

        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));


    }
}
