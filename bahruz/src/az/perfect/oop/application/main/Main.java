package az.perfect.oop.application.main;

import az.perfect.oop.application.InputUtil.AppUtil;
import az.perfect.oop.application.bean.Todo;
import az.perfect.oop.application.data.Base;

public class Main {
    public static void main(String[] args) {


        while (true) {

            int Menu = AppUtil.getCount("Command" +
                    "\n1.Add" +
                    "\n2.List" +
                    "\n3.Remove" +
                    "\n4.Exit");

            if (Menu == 4) {
                break;
            }

            if (Menu == 1) {
                int count = AppUtil.getCount("Enter the count");
                Base.application = new Todo[count];
                for (int i = 0; i < count; i++) {
                    Base.application[i] = AppUtil.fillApplication();

                }
            } else if (Menu == 2) {
                AppUtil.appList();
            } else if (Menu == 3) {
                AppUtil.appList();
                int removeApp = AppUtil.getCount("Enter the count: ");
                Base.application[removeApp] = null;
            } else if (Menu == 4) {
                System.exit(0);
            }

        }
    }
}
