package az.perfect.oop.studentregister.util;

import java.util.Scanner;

public class InputUtil {

    public static String getText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        return sc.nextLine();
    }

    public static int getCount(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        String countStr = sc.nextLine();
        try {
            return Integer.parseInt(countStr);

        } catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Invalid number. Please enter a numeric value for number.");

        }

    }
}
