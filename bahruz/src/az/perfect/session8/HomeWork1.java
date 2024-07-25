package az.perfect.session8;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {


        //Recursive and Loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Sum of number up to " + number + "using recursive is a " + sumOfRecursive(number));
        System.out.println("Sum of number up to " + number + " using loop is " + sumUsingLoop(number));


    }


    //HomeWork1
    public static int sumUsingLoop(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        return sum;
    }

    //HomeWork1
    public static int sumOfRecursive(int number) {

        int sum = 0;
        if (number > 0) {
            sum = number + sumOfRecursive(number - 1);
        }

        return sum;
    }
}

