package session5;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int n = sc.nextInt();
        for (int number = 0; number <= n; number++) {
            boolean isPr = true;
            if (number <= 1) {
                isPr = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPr = false;
                        break;
                    }
                }
            }
            if (isPr) {
                System.out.print(number + " ");
            }
        }
    }
}
