package Exercises;

import java.util.Scanner;
//14. Write a Java program to display the multiplication table of a given integer.
public class ElshanEx14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number (Table to be calculated): ");
        int x = scanner.nextInt();

        for (int i=0; i <= 5; i++){
            int multi = 0;
            multi = i*x;
            System.out.println(x + " x " + i + "= "+multi );
        }

    }
}
