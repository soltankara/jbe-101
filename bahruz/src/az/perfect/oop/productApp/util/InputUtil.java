package az.perfect.oop.productApp.util;

import java.util.Scanner;

public class InputUtil {

    public static String getText(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title + ":");
        return scanner.nextLine();
    }

    public static Integer getCount(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title + ":");
        String countStr = scanner.nextLine();
        try {
            return Integer.parseInt(countStr);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Invalid number. Please enter a numeric value for number.");

        }
    }

    public static Double getPrice(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title + ":");
        String countStr = scanner.nextLine();
        try {
            return Double.parseDouble(countStr);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Invalid number. Please enter a numeric value for number.");

        }
    }
}