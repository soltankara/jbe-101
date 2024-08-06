package session12;

import session12.service.TodoService;
import session12.service.impl.TodoServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoService service = new TodoServiceImpl();

        Object[] student = new Object[6];

        while (true) {
            Scanner scanner = new Scanner(System.in);
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
            }
        }

    }

}
