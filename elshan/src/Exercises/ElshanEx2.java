package Exercises;

import java.util.Scanner;
//2. Write a Java program to solve quadratic equations (use if, else if and else).
public class ElshanEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, x2;
        double d;
        System.out.print("a = ");
        float a = scanner.nextFloat();

        System.out.print("b = ");
        float b = scanner.nextFloat();

        System.out.print("c = ");
        float c = scanner.nextFloat();

        d = (double) Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            x1 =  (double) (-b + Math.sqrt(d)) / (2 * a);
            x2 = (double) (-b - Math.sqrt(d) / (2 * a));
            System.out.println("The roots are real and different.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("The roots are real and the same.");
            System.out.println("x1 = x2 = " + x1);

        } else {
            System.out.println("No real roots exist.");
        }
    }

}
