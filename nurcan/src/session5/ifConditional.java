package session5;

import java.util.Scanner;

public class ifConditional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        //1
//        System.out.print("Enter number: ");
//        int number = scan.nextInt();
//        if (number > 0) {
//            System.out.println(number + " is positive");
//        } else if (number < 0) {
//            System.out.println(number + " is negative");
//        } else {
//            System.out.println("Number is 0");
//        }
//        //2
//        System.out.print("Input a: ");
//        double a = scan.nextDouble();
//        System.out.print("Input b: ");
//        double b = scan.nextDouble();
//        System.out.print("Input c: ");
//        double c = scan.nextDouble();
//        double result = b * b - 4 * a * c;
//        if (result > 0) {
//            double r1 = (-b + Math.sqrt(result)) / (2 * a);
//            double r2 = (-b - Math.sqrt(result)) / (2 * a);
//            System.out.println("The roots are " + r1 + " and " + r2);
//        } else if (result == 0) {
//            double r1 = -b / (2 * a);
//            System.out.println("The root is " + r1);
//        } else {
//            System.out.println("The equation has no real roots.");
//        }
//        //3
//        System.out.println("Enter numbers: ");
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        if (a >= b && a >= c) {
//            System.out.println("The greatest: " + a);
//        } else if (b >= a && b >= c) {
//            System.out.println("the gretaest: " + b);
//        } else {
//            System.out.println("The greatest: " + c);
//        }
//        //4
//        System.out.print("Input value: ");
//        double input = scan.nextDouble();
//
//        if (input > 0) {
//            if (input < 1) {
//                System.out.println("Positive small number");
//            } else if (input > 1000000) {
//                System.out.println("Positive large number");
//            } else {
//                System.out.println("Positive number");
//            }
//        } else if (input < 0) {
//            if (Math.abs(input) < 1) {
//                System.out.println("Negative small number");
//            } else if (Math.abs(input) > 1000000) {
//                System.out.println("Negative large number");
//            } else {
//                System.out.println("Negative number");
//            }
//        } else {
//            System.out.println("Zero");
//        }
//        //6
//        System.out.println("Enter 2 numbers: ");
//        float a = scan.nextFloat();
//        float b = scan.nextFloat();
//        a = Math.round(a * 1000);
//        a = a / 1000;
//        b = Math.round(b * 1000);
//        b = b / 1000;
//        if (a == b) {
//            System.out.println("They are the same up to three decimal places");
//        } else {
//            System.out.println("They are different");
//        }
        //10
        System.out.println("Enter number: ");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

    }
}
