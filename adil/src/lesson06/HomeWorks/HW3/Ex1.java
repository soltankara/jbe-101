package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        if (n > 0) System.out.println("Number is positive");
        else if (n < 0) System.out.println("Number is negative");
        else System.out.println("Number is zero");
    }
}
