package Exercises;

import java.util.Scanner;
//15. Write a Java program that displays the sum of n odd natural numbers.
public class ElshanEx15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of terms is: ");
        int num = scanner.nextInt();
        int sum =0;
        System.out.println("The odd numbers are: ");
        for (int i = 0,j =1 ;i<num; i++, j +=2  ){
            System.out.println(j);
            sum += j;
        }
        System.out.println("The Sum of odd Natural Number upto 5 terms is: " + sum);
    }
}
