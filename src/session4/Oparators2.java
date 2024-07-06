package src.session4;

import java.util.Scanner;

public class Oparators2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == b) System.out.println("a equals to b");
        if (a != b) System.out.println("a is not equal to b");
        if (a > b) System.out.println("a is greater than b");
        if (a < b) System.out.println("b is greater than a");
        if (a >= b ) System.out.println("a is greater than or equal to b");
        if (a <= b) System.out.println("b is greater than or equal to a");
    }
}
