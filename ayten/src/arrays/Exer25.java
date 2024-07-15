package arrays;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {
        //   25. Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[]{2, 3, 5, 7, 9};
        int[] arr2 = new int[]{2, 5, 6, 9};
        int[] arr3 = new int[]{2, 8, 9, 11};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] > arr1[i]) break;
                if (arr2[j] == arr1[i]) {
                    for (int k = 0; k < arr3.length; k++) {
                        if (arr2[j] > arr1[i]) break;
                        if (arr3[k] == arr2[j]) System.out.println(arr1[i]);
                    }
                }
            }
        }
    }
}
