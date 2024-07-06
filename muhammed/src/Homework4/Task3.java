package Homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //*********1:
//        System.out.print("Please enter a number: ");
//        int number = scanner.nextInt();
//        if (number > 0){
//            System.out.printf("%d is positive%n", number);
//        }
//        else if (number == 0){
//            System.out.println("0 is not positive or negative");
//        }
//        else {
//            System.out.printf("%d is negative%n", number);
//        }
        //*************2:
//        System.out.print("Input a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Input b: ");
//        double b = scanner.nextDouble();
//        System.out.print("Input c: ");
//        double c = scanner.nextDouble();
//
//        double result = Math.pow(Math.pow(b,2) - (4 * a * c),0.5);
//        System.out.printf("D = %f%n",Math.pow(result,2));
//        if (result >0 ){
//            double r1 = (-b + result)/(2*a);
//            double r2 = (-b - result)/(2*a);
//            System.out.printf("r1 = %f and r2 = %f.%n",r1,r2);
//        }
//        else if (result < 0){
//            System.out.println("no real roots");
//        }
//        else {
//            double r1 = -b/(2*a);
//            System.out.printf("r1 = r2 = %f%n",r1);
//        }
        // *************3
//        System.out.print("Enter the first number: ");
//        int first = scanner.nextInt();
//        System.out.print("Enter the second number: ");
//        int second = scanner.nextInt();
//        System.out.print("Enter the third number: ");
//        int third = scanner.nextInt();
//        if (first > second && first > third){
//            System.out.printf("The greatest : %d%n", first);
//        }
//        else if (second > first && second > third){
//            System.out.printf("The greatest : %d%n", second);
//        }
//        else {
//            System.out.printf("The greatest %d", third);
//        }
        //***********4
//        System.out.print("Enter any number: ");
//        double number = scanner.nextDouble();
//        if (number == 0) {
//            System.out.println("Zero");
//        } else if (number >= 1 && number <= 1000000) {
//            System.out.println("Positive");
//        } else if (number < 0) {
//            System.out.println("Negative");
//        } else if (number > 1000000) {
//            System.out.println("large");
//        } else {
//            System.out.println("small");
//        }
        //***********5
        // We did it during the lesson
        //********6
        // i couldn't understand what is the purpose of question
        //*******7
//        System.out.print("Year: ");
//        int year = scanner.nextInt();
//        System.out.print("Number of month: ");
//        int number = scanner.nextInt();
//        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12){
//            System.out.println(31);
//        }
//        else if (number == 2){
//            if (year % 4 == 0){
//                System.out.println(29);
//            }
//            else {
//                System.out.println(28);
//            }
//        }
//        else {
//            System.out.println(30);
//        }
        //***********8
//        System.out.print("Input alphabet : ");
//        String alphabet = scanner.next().toLowerCase();
//        char letter = alphabet.charAt(0);
//        if (((letter >= 'a' && letter <= 'z') & alphabet.length() == 1)) {
//            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
//                System.out.println("Vowel");
//            } else {
//                System.out.println("Consonant");
//            }
//        } else if (alphabet.length() != 1) {
//            System.out.println("this is not one length letter");
//        }
//        else {
//            System.out.println("This is not letter");
//    }
        // ************* 9
//        System.out.print("Input a year: ");
//        int year = scanner.nextInt();
//        if (year %4 == 0){
//            System.out.println("Leap year");
//        }
//        else {
//            System.out.println("Not leap year");
//        }
        //**************10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
        //*************11
//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= number ; i++) {
//            System.out.println(i);
//            sum += i;
//        }
//        System.out.printf("sum : %d",sum);
        //**********12
//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= number; i++) {
//            System.out.println(i);
//            sum += i;
//        }
//        System.out.printf("sum : %d, the average = %d", sum, sum/number);
        //**********13
//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= number; i++) {
//            System.out.printf("Number is %d, cube is %d%n",i, Math.round(Math.pow(i,3)));
//        }
        //***********14
//        System.out.print("Input number: ");
//        int number = scanner.nextInt();
//        System.out.print("Number of terms:");
//        int terms = scanner.nextInt();
//        for (int i = 0; i <=terms ; i++) {
//            System.out.printf("%d * %d = %d%n",number,i,number*i);
//        }
        //***********15
//        System.out.print("Input number: ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <=number ; i+=2) {
//            System.out.println(i);
//        }
        //*********16
        // System.out.print("Input number of rows: ");
        //        int numberOfRows = scanner.nextInt();
//        for (int i = 1; i <=numberOfRows ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.printf("%n");
//        }
        // *********17
//        System.out.print("Input number of rows: ");
//        int numberOfRows = scanner.nextInt();
//        for (int i = 1; i <= numberOfRows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.printf("%n");
//        }
        // *********18
//        System.out.print("Input number of rows: ");
//        int numberOfRows = scanner.nextInt();
//        int a = 1;
//        for (int i = 1; i <= numberOfRows ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(a++);
//            }
//            System.out.println(" ");
//        }
        //*********19
        // i couldn't solve this
        //**********20
        // Same as 18

    }
}
