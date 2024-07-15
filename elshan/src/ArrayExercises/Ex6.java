package ArrayExercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 6. Write a Java program to find the index of an array element.
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 3, 4, 1, 5};
        int j = 0;
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for (int i : arr) {
            j++;
            if (num == i) {
                System.out.println("The index of array element: "+ j);
                break;
            }
        }
    }
}
