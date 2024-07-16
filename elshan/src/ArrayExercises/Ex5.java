package ArrayExercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 5. Write a Java program to test if an array contains a specific value.
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 3, 4, 1, 5};
        int j = 0;
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for (int i : arr) {
            j++;
            if (num == i) {
                System.out.println("Number is found!");
                break;
            } else if (j == arr.length) {
                System.out.println("Number is not found!");
            }

        }


    }
}
