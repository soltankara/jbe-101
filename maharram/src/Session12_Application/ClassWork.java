package Session12_Application;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        ToDoService service = new ToDoServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("How many time  would you like to add?  : ");
                int count = scanner.nextInt();
                scanner.nextLine();
                service.add(count);
            } else if (command.equalsIgnoreCase("list")) {
                service.printAll();
            } else if (command.equalsIgnoreCase("remove")) {
                service.remove();
            }
        }
    }
}
