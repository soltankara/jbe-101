package session5;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int first = scanner.nextInt();

        System.out.print("Input the 2nd number: ");
        int second = scanner.nextInt();

        System.out.print("Input the 3rd number: ");
        int third = scanner.nextInt();
        int max = first;

        if (second > first) {
            max = second;
        }
        if (third > second) {
            max = third;
        }
        System.out.println("The greatest " + max);
    }
}
