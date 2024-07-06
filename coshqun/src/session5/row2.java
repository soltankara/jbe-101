package session5;

import java.util.Scanner;

public class row2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println(" ");
        }

    }
}
