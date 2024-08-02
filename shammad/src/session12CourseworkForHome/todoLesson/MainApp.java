package session12CourseworkForHome.todoLesson;

import session12CourseworkForHome.todoLesson.service.impl.TaskManager;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(2);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                taskManager.add();
            } else if (command.equalsIgnoreCase("list")) {
                taskManager.printAll();
            } else if (command.equalsIgnoreCase("remove")) {
                taskManager.remove();
            } else if (command.equalsIgnoreCase("quit")) {
                System.out.println("Quitting...");
            } else {

                System.out.println("Incorrect command. Try again.");
            }
        }
    }
}
