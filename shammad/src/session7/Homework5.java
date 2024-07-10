package session7;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        //9. Write a Java program to insert an element (specific position) into an array.
        //Note: Considered spesific position is NOT index.
        int[] arr = new int[]{1, 5, 3, 8, 2, 9};
        int[] newArr = new int[arr.length + 1];
        int spesificPosition = 3;

        for (int i = 0; i < arr.length; i++) {
            if (i == (spesificPosition - 1)) {
                newArr[spesificPosition - 1] = 233;
                continue;
            }
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
