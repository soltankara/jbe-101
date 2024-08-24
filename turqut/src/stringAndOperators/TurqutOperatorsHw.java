package turqut.src.stringAndOperators;

import java.util.Scanner;

public class TurqutOperatorsHw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double ratio = (double) num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Ratio : " + ratio);
        System.out.println("Remainder : " + remainder);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        boolean exp1 = (number1 == number2);
        boolean exp2 = (number1 != number2);
        boolean exp3 = (number1 > number2);
        boolean exp4 = (number1 < number2);
        boolean exp5 = (number1 >= number2);
        boolean exp6 = (number1 <= number2);

        System.out.println(number1 + " and " + number2 + " are equal  : " + exp1);
        System.out.println(number1 + " and " + number2 + " are not equal : " + exp2);
        System.out.println(number1 + " is greater than " + number2 + " : " + exp3);
        System.out.println(number1 + " is less than " + number2 + " : " + exp4);
        System.out.println(number1 + " is greater than or equal to " + number2 + " : " + exp5);
        System.out.println(number1 + " is less than or equal to " + number2 + " : " + exp6);

    }
}
