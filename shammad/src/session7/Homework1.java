package session7;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        //4. Write a Java program to calculate the average value of array elements.
        //1)
        int[] arr = new int[]{1, 5, 3, 8, 2, 9};
        double asDouble = Arrays.stream(arr).average().getAsDouble();
        System.out.println(asDouble);
        //2)
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double lengthOfArrayInDouble = arr.length;
        System.out.println(sum / lengthOfArrayInDouble);
    }
}
