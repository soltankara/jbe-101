package lesson06.ClassWorks;

import java.util.Scanner;

public class CWLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        String result;
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0) result = "even";
            else result = "odd";
            System.out.println(i + " " + result);
            i++;
        }
    }
}
