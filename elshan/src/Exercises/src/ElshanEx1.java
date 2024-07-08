package Exercises.src;

import java.util.Scanner;

public class ElshanEx1 {
    public static void main(String[] args) {
        //1. Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float x = scanner.nextFloat();

        if (x > 0){
            System.out.println(x + " is positive. ");
        } else if (x == 0) {
                System.out.println(x + " is zero. ");
        }
        else {
            System.out.println(x+ " is negative.");
        }
    }
}
