package Module02.Session12;

import Module02.Session12.ClassworkToDo.Service.ToDoService;
import Module02.Session12.ClassworkToDo.Service.impl.ToDoServiceImpl;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        ToDoService toDoService = new ToDoServiceImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nCommand: ");
            String command = sc.nextLine().toLowerCase();
            switch (command) {
                case "quit":
                    return;
                case "add":
                    toDoService.addToDo();
                    break;
                case "list":
                    toDoService.printAllToDo();
                    break;
                case "remove":
                    toDoService.removeToDo();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
