package Classwork;
import Classwork.Model.Todo;
import Classwork.Service.Impl.TodoServiceImpl;
import Classwork.Service.TodoService;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        TodoService service = new TodoServiceImpl();

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
            }
        }
    }

}

