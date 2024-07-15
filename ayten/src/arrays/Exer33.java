package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exer33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{2, 3, 3, 5, 7, 2, 2};
        int k = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) k++;
        }
        System.out.println(k + 1);
    }
}
