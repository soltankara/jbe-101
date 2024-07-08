package session6coursework;

import java.util.Scanner;

public class CourseWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int numberCopy = number;
        int sum = 0;
        int temp = 0;

        while (numberCopy != 0){
            temp = numberCopy % 10;
            sum += temp*temp*temp;
            numberCopy /= 10;
        }

        System.out.println(number==sum);
    }
}
