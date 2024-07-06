package session5;

import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.println("The sum of them is: " + sum);
    }
}
