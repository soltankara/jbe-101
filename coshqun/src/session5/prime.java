package session5;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int integer = scanner.nextInt();

        for (int i = 2; i <= integer; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);
        }
    }
}
