package Homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number%i == 0){
                System.out.printf("%d ",i);
            }
        }

    }
}
