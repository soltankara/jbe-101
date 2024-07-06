package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int a = scanner.nextInt();
        System.out.print("Input the 2st number: ");
        int b = scanner.nextInt();
        System.out.print("Input the 3st number: ");
        int c = scanner.nextInt();
        int greatest = Math.max(Math.max(a, b), c);
        System.out.println("The greatest: " + greatest);
    }
}
