package Exercises.src;

import java.util.Scanner;

//3. Write a Java program that takes three numbers from the user and prints the greatest number.

public class ElshanEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNum = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNum = scanner.nextFloat();

        System.out.print("Enter the third number: ");
        float thirdNum = scanner.nextFloat();

        float greatest = firstNum;

        if (secondNum >= greatest){
            greatest = secondNum;
        }
        if (thirdNum >= greatest){
            greatest = thirdNum;
        }

        System.out.println("the greatest number is " + greatest);

    }
}
