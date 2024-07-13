package az.perfect.truing.homework3;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();


        if (number < 0) {
            System.out.println("Number is negativ");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is positive");

        }

    }
}
