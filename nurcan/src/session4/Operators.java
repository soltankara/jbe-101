package session4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int number1 = scan.nextInt();
        System.out.print("Enter number 2:");
        int number2 = scan.nextInt();

        //homework 1
        System.out.printf("%d+%d=%d\n", number1, number2, number1 + number2);
        System.out.printf("%d-%d=%d\n", number1, number2, number1 - number2);
        System.out.printf("%d*%d=%d\n", number1, number2, number1 * number2);
        System.out.printf("%d/%d=%d\n", number1, number2, number1 / number2);
        System.out.printf("remainder %d/%d ->%d\n", number1, number2, number1 % number2);

        //homework 2
        System.out.printf("%d is equal %d?: %b\n", number1, number2, number1 == number2);
        System.out.printf("%d is not equal %d?: %b\n", number1, number2, number1 != number2);
        System.out.printf("%d is greater than %d?: %b\n", number1, number2, number1 > number2);
        System.out.printf("%d is less than %d?: %b\n", number1, number2, number1 < number2);
        System.out.printf("%d is greater than or equal %d?: %b\n", number1, number2, number1 >= number2);
        System.out.printf("%d is less than or equal %d?: %b", number1, number2, number1 <= number2);

    }
}
