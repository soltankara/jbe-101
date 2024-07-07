package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input floating-point number: ");
        double a = scanner.nextDouble();
        System.out.print("Input floating-point another number: ");
        double b = scanner.nextDouble();
        a = (int) (a * 1000);
        b = (int) (b * 1000);
        if (a == b) {
            System.out.println("They are same");
        } else System.out.println("They are different");
    }
}
