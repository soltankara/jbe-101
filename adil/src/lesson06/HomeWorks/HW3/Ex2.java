package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input c: ");
        int c = scanner.nextInt();
        double D = (Math.pow(b, 2) - 4 * a * c);
        double root1 = (-b + Math.sqrt(D)) / (2 * a);
        double root2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println("The roots are " + root1 + " and " + root2);

    }
}
