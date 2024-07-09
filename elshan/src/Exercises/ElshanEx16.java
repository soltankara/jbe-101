package Exercises;

import java.util.Scanner;
//16. Write a Java program to display the pattern like a right angle triangle with a number.
public class ElshanEx16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int num = scanner.nextInt();
        int tmp = 0;
        for (int i = 1; i <= num; i++){
            tmp = tmp*10 +i;

            System.out.println(tmp);
        }

    }
}
