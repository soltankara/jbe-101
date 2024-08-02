package session12CourseworkForHome.todoLesson;

import todoLesson.service.impl.TaskManager;

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
                continue;
            }

            if (command.equalsIgnoreCase("list")) {
                taskManager.printAll();
                continue;
            }

            if (command.equalsIgnoreCase("remove")) {
                taskManager.remove();
                continue;
            }

            if (command.equalsIgnoreCase("quit")) {
                System.out.println("Quitting...");
                break;
            }

            System.out.println("Incorrect command. Try again.");
        }
    }
}
