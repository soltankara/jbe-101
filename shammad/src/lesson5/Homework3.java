package lesson5;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercise1
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(number==0? "0 is neither positive nor negative.": (number>0? "Positive" : "Negative"));

        //Exercise2
        System.out.print("Enter 'a': ");
        double a = scanner.nextDouble();
        System.out.print("Enter 'b': ");
        double b = scanner.nextDouble();
        System.out.print("Enter 'c': ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0.0) {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0.0) {
            double root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
