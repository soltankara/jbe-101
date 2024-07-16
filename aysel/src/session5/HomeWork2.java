package session5;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        // n ededi daxil edilir dovr vasitesile hemin edede beraber yaxud ondan kicik prime ededler tapilir
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = scanner.nextInt();

        // Loop through numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Check if i is a prime number
            for (int j = 2; j * j <= i; j++) { // optimized loop condition
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If i is a prime number, print it
            if (isPrime) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}


