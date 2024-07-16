package session6;
// 1 - Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        String[] arr = {"b", "c", "e", "d", "a"};
        Arrays.sort(array);
        Arrays.sort(arr);
        for (int num : array) System.out.print(num + " ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
