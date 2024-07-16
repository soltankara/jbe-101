package session6;
// 7 - Write a Java program to remove a specific element from an array.
// There is problem in this code

import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {15, 25, 5, 10, 12, 36};

        int n = scanner.nextInt();
        for (int i = n; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int num : array) System.out.print(num + " ");
    }
}
