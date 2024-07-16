package lesson05;

import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((float) a / b);
        System.out.println(a % b);
    }
}
