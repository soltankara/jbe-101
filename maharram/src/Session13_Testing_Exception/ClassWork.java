package Session13_Testing_Exception;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        ToDoService service = new ToDoServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Command (add, list, remove, quit): ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            switch (command.toLowerCase()) {
                case "add":
                    handleAddCommand(service, scanner);
                    break;
                case "list":
                    service.printAll();
                    break;
                case "remove":
                    service.remove();
                    break;
                default:
                    System.out.println("Invalid command: " + command);
                    System.out.println("Please enter a valid command (add, list, remove, quit).");
            }
        }
    }

    private static void handleAddCommand(ToDoService service, Scanner scanner) {
        System.out.print("How many items would you like to add? ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        int count = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        service.add(count);
    }
}
