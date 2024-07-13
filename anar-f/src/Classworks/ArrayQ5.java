package Classworks;

import java.util.Scanner;

public class ArrayQ5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter first index: ");
        Scanner sc = new Scanner(System.in);
        int firstIndex = sc.nextInt();
        System.out.print("Enter second index: ");
        int secondIndex = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
