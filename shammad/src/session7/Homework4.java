package session7;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        //8. Write a Java program to copy an array by iterating the array.
        int[] arr = new int[]{1, 5, 3, 8, 2, 9};
        int[] arrCopied = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrCopied[i] = arr[i];
        }
        System.out.println(Arrays.toString(arrCopied));
    }
}
