package classwork;

import classwork.service.TodoService;
import classwork.service.TodoServiceImpl;

import java.util.Scanner;

public class Classwork {

    public static void main(String[] args) {
        TodoService service = new TodoServiceImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            if (command.equalsIgnoreCase("add")) {
                service.add();
            }

            if (command.equalsIgnoreCase("list")) {
                service.printAll();
            }

            if (command.equalsIgnoreCase("remove")) {
                service.remove();
            } else System.out.println("Invalid command. Please enter the valid command.");
        }
    }
}

