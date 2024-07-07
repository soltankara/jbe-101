package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLeap;
        System.out.print("Input the year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println(year + " is a leap year");
        else System.out.println(year + " isn't a leap year");
    }
}
