package Session13_Testing_Exception;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        ToDoService service = new ToDoServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (!("add".equalsIgnoreCase(command) || command.equalsIgnoreCase("list") || "remove".equalsIgnoreCase(command) || command.equalsIgnoreCase("quit"))) {
                try {
                    throw new InvalidException("invalid command  : " + command);
                } catch (InvalidException ex) {
                    System.out.println(ex.getMessage());
                    System.out.println("pls enter real command (add , list , remove , quit ) ");
                }
            }

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
