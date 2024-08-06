package turqut.src.lesson5;

import java.util.Scanner;

public class Lesson5task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } else if (n == 0 || n == 1) {
            System.out.println("There is no prime number is this range.");
        } else {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
