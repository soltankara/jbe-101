package Exercises;

import java.util.Scanner;
//13. Write a Java program to display the cube of the given number up to an integer.
public class ElshanEx13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of terms: ");
        int num = scanner.nextInt();
        int cube = 0;
        for (int i = 0; i <= num; i++){
            cube = (int) Math.pow(i,3);
            System.out.println("Number is: "+ i +" and cube of "+ i + " is "+ cube);
        }

    }
}
