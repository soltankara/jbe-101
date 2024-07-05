package lesson4;

import java.util.Scanner;

//HomeWork 3
//Note: empty scanner.nextLine() method prevents bugs to occur.
public class Homework3 {
    public static void main(String[] args) {
        //First part
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.printf("Addition: %.1f\n", num1 + num2);
        System.out.printf("Subtraction: %.1f\n", num1 - num2);
        System.out.printf("Multiplication: %.1f\n", num1 * num2);
        System.out.printf("Division: %.1f\n", num1 / num2);
        System.out.printf("Modulus: %.1f\n", num1 % num2);

        //Second part
        System.out.println("Number1 equals number2: " + (num1 == num2));
        System.out.println("Number1 does not equal number2: " + (num1 != num2));
        System.out.println("Number1 is greater than number2: " + (num1 > num2));
        System.out.println("Number1 is less than number2: " + (num1 < num2));
        System.out.println("Number1 is greater or equal to number2: " + (num1 >= num2));
        System.out.println("Number1 is less or equal to number2: " + (num1 <= num2));
    }
}
