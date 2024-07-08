package lesson06.HomeWorks;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int m) {
        for (int i = 2; i * i <= m; i++) {
            if (m % i == 0) return false;
        }
        return true;
    }
}
