package az.turing.session3;

import java.util.Scanner;

public class Stringaj {
    public static void main(String[] args) {


        int number = 5;
        number++;
        System.out.println("Number is " + number); // ?6
        number = 5;
        ++number;
        System.out.println("Number is " + number); // ?6
        number = 5;
        System.out.println("Number is " + number++); // ?5
        System.out.println("Number is " + number); // ?6
        number = 5;
        System.out.println("Number is " + ++number); // ?6


    }
}
