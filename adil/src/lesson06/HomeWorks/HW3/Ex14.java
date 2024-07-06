package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
}
