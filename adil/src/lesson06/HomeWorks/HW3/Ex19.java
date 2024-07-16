package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int n = scanner.nextInt();
        int k = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < k - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
