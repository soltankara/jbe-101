package lesson5;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercise1
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(number == 0 ? "0 is neither positive nor negative." : (number > 0 ? "Positive" : "Negative"));

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

        //Exercise3
        System.out.print("Input the 1st number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Input the 2nd number: ");
        int secondNum = scanner.nextInt();

        System.out.print("Input the 3rd number: ");
        int thirdNum = scanner.nextInt();

        System.out.println(Math.max(firstNum, Math.max(secondNum, thirdNum)));

        //Exercise4
        System.out.print("Input a number: ");
        double floatNumber = scanner.nextDouble();


        System.out.println(number == 0.0 ? "Zero" : (number > 0.0 ? "Positive" : "Negative"));

        double absOfNumber = Math.abs(floatNumber);
        if (absOfNumber < 1)
            System.out.println("Small");
        else if (absOfNumber > 1000000)
            System.out.println("Large");

        //Exercise7
        int dayInMonth = 0;
        String month = "Unknown";

        System.out.print("Input a month number: ");
        int inputMonth = scanner.nextInt();

        System.out.print("Input a year: ");
        int inputYear = scanner.nextInt();

        switch (inputMonth) {
            case 1:
                month = "January";
                dayInMonth = 31;
                break;
            case 2:
                month = "February";
                if ((inputYear % 400 == 0) || ((inputYear % 4 == 0) && (inputYear % 100 != 0))) {
                    dayInMonth = 29;
                } else {
                    dayInMonth = 28;
                }
                break;
            case 3:
                month = "March";
                dayInMonth = 31;
                break;
            case 4:
                month = "April";
                dayInMonth = 30;
                break;
            case 5:
                month = "May";
                dayInMonth = 31;
                break;
            case 6:
                month = "June";
                dayInMonth = 30;
                break;
            case 7:
                month = "July";
                dayInMonth = 31;
                break;
            case 8:
                month = "August";
                dayInMonth = 31;
                break;
            case 9:
                month = "September";
                dayInMonth = 30;
                break;
            case 10:
                month = "October";
                dayInMonth = 31;
                break;
            case 11:
                month = "November";
                dayInMonth = 30;
                break;
            case 12:
                month = "December";
                dayInMonth = 31;
        }
        System.out.println(month + " " + inputYear + " has " + dayInMonth + " days");

        //Exercise12
        int sum = 0;

        System.out.println("Input the 5 numbers :");
        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }

        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is: " + (sum / 5.0));

        //Exercise 16
        System.out.print("Input number of rows: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Exercise18
        int numberToPrint = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(numberToPrint + " ");
                numberToPrint++;
            }
            System.out.println();
        }
    }
}
