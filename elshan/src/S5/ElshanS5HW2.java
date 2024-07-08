package S5;

import java.util.Arrays;
import java.util.Scanner;

// Eratosfen alqoritmi

public class ElshanS5HW2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false; // 1 sadə ədəd deyil

        int p = 2;
        while (p * p <= n) {
            if (isPrime[p - 1]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i - 1] = false;
                }
            }
            p++;
        }

        System.out.println("Sadə ədədlər:");
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
