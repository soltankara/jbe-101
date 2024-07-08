package session6coursework;

import java.util.Scanner;

public class CourseWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = 0;

        while (number != 0) {
            temp = number % 10;
            sum += temp;
            number /= 10;
        }

        System.out.println("Sum of digits is: " + sum);
    }
}
