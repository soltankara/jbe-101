package session7;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {
        //11. Write a Java program to reverse an array of integer values.
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrReversed = new int[arr.length];

        for (int i = (arr.length - 1); i >= 0; i--) {
            arrReversed[(arr.length - 1) - i] = arr[i];
        }
        System.out.println(Arrays.toString(arrReversed));
    }
}
