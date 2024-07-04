package src;

import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        System.out.println("The division of " + a + " and " + b + " is " + (a / b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
    }
}
