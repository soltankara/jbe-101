
//Operators Homework

import java.util.Scanner;

public class Homewoper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number : ");

        double number1 = sc.nextDouble();

        System.out.print("enter second number :");

        double number2 = sc.nextDouble();

        System.out.println("the sum of numbers  :" + (number2 + number1));
        System.out.println("the subtract of numbers  :" + (number1 - number2));
        System.out.println("the multiply of numbers  :" + (number1 * number2));
        System.out.println("the divide of numbers  :" + (number1 / number2));
        System.out.println("the modulus of numbers  :" + (number2 % number1));


        if (number2 > number1) {
            System.out.println("number2 is greater than number1");
        } else if (number1 > number2) {
            System.out.println("number1 is greater than number2");
        } else {
            System.out.println("number1 and number are equal");
        }


    }
}
