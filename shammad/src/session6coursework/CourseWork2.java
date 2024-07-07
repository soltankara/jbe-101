package session6coursework;

import java.util.Scanner;

public class CourseWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int firstNum = 0;
        int secondNum = 1;
        int sum = firstNum + secondNum;

        for (int i = 0; i < number; i++) {
            System.out.print(firstNum + " ");

            firstNum = secondNum;
            secondNum = sum;
            sum = firstNum + secondNum;
        }
    }
}
