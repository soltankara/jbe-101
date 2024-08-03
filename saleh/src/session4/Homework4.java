package session4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = sc.nextInt();

        System.out.print("Choose an operation (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        System.out.println(calculator(op, num1, num2));

    }

    public static int calculator(char op, int num1, int num2) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0)
                    return num1 / num2;
                else
                    return 0;
            case '%':
                if (num2 != 0)
                    return num1 % num2;
                else
                    return 0;
            default:
                System.out.println("Invalid choice.");
        }
        return 0;
    }
}
