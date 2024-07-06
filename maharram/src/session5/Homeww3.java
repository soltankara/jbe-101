package session5;

import java.util.Scanner;

public class Homeww3 {
    public static void main(String[] args) {

        //1.1. Write a Java program to get a number from the user and print whether it is positive or negative.
        //
        //Test Data
        //Input number: 35
        //Expected Output :
        //Number is positive

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = sc.nextInt();

        if (number >0){
            System.out.print("number is positive");

        }else if (number==0){
            System.out.println("number is zero ");
        }else if (number<0){
            System.out.println("number is negative ");
        }



    }
}




