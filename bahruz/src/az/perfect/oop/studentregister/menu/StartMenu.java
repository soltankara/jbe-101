package az.perfect.oop.studentregister.menu;

import az.perfect.oop.studentregister.exception.StudentException;
import az.perfect.oop.studentregister.util.InputUtil;
import az.perfect.oop.studentregister.util.StudentUtil;

public class StartMenu {

    public static void startMenu() {

        StudentUtil studentUtil = new StudentUtil();
        label:
        while (true) {
            Integer menu = null;
            try {
                menu = InputUtil.getCount("Choose from the menu:" +
                        "\n1.Add student" +
                        "\n2.See the list of requirements" +
                        "\n3.Search for a student" +
                        "\n4.Change student information" +
                        "\n5.Delete student data" +
                        "\n6.Logout");
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Please,Enter a number!");
                continue;
            }
            try {
                switch (menu) {
                    case 1:
                        studentUtil.studentRegistration();
                        break;
                    case 2:
                        studentUtil.showStudent();
                        break;
                    case 3:
                        studentUtil.findStudent();
                        break;
                    case 4:
                        studentUtil.editStudent();
                        break;
                    case 5:
                        studentUtil.deleteStudent();
                        break;
                    case 6:
                        break label;
                    default:
                        throw new StudentException("Make the right choice from the menu!");
                }

            } catch (StudentException studentException) {
                System.out.println(studentException.getLocalizedMessage());

            }


        }
    }

}
