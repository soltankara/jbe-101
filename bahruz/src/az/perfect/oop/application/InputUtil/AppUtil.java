package az.perfect.oop.application.InputUtil;

import az.perfect.oop.application.bean.Todo;
import az.perfect.oop.application.data.Base;

import java.util.Scanner;

public class AppUtil {

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

    public static Todo fillApplication() {
        String title = AppUtil.getText("Title daxil et");
        String description = AppUtil.getText("Description daxil et");
        String dueDate = AppUtil.getText("DueDate daxil et");
        String status = AppUtil.getText("Status daxil et");
        return new Todo(title, description, dueDate, status);
    }

    public static void appList() {


        for (int i = 0; i < Base.application.length; i++) {

            if (Base.application[i] != null) {
                System.out.println(Base.application[i]);
            }

        }
    }


}
