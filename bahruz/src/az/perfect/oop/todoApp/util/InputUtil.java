package az.perfect.oop.todoApp.util;

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
        return sc.nextInt();
    }
}
