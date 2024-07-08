package Exercises.src;

import java.util.Scanner;

//6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
public class ElshanEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();
        if (Math.abs(num1 - num2) <= 0.001) {
            System.out.println("They are the same up to three decimal places.");
        } else {
            System.out.println("They are different.");
        }

    }
}
