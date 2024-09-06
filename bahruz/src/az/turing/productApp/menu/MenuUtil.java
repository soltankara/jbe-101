package az.turing.productApp.menu;

import az.turing.productApp.data.Base;

import java.util.Scanner;

public class MenuUtil {

    public static void showAllMenu() {

        Menu menu[] = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != Menu.UNKNOWN) {
                if (menu[i] == Menu.LOGİN || menu[i] == Menu.REGİSTER) {
                    if (!Base.logeddin) {
                        System.out.println(menu[i]);
                    }
                } else if (Base.logeddin) {
                    System.out.println(menu[i]);
                }
            }
        }
    }


    public static void startMenu() {
        while (true) {
            showAllMenu();
            try {
                Integer selectedMenu = getInteger("Select Menu");
                Menu menu = Menu.findMenuforNumber(selectedMenu);
                menu.enumProsess();

            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getLocalizedMessage());
            }
        }
    }

    public static Integer getInteger(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ":");
        return sc.nextInt();
    }

    public static String getText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ":");
        return sc.nextLine();
    }

    public static Double getDouble(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ":");
        return sc.nextDouble();
    }

}
