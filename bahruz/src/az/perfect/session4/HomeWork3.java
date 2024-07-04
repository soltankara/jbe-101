package az.perfect.session4;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

          /*
      Operators Homework

1. Write a program that reads two integers from the user and performs arithmetic operations
(addition, subtraction, multiplication, division, modulus) on them.
2. Write a program that reads two integers from the user and determines if they are equal, not equal,
greater than, less than, greater than or equal to, and less than or equal to each other.
       */



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        double number1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        double number2 = sc.nextInt();
        System.out.println("Enter the operator:");
        char oper = sc.next().charAt(0);
        double answer = 0;
        switch (oper) {
            case '+':
                answer = number1 + number2;
                break;
            case '-':
                answer = number1 - number2;
                break;
            case '*':
                answer = number1 * number2;
                break;
            case '/':
                answer = number1 / number2;
                break;
            default:
                System.out.println("Please,Choose the Correct Operator!!!!!");
        }

        if (answer % 1 == 0) {
            System.out.println("Your answer: " + (int) answer);
        } else {
            System.out.println("Your answer: " + answer);

        }
    }
}