package session12;

import Information.service.InformationService;
import Information.service.InformationServiceImpl;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        InformationService service = new InformationServiceImpl();
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            } else if (command.equalsIgnoreCase("add")) {
                service.add();
            } else if (command.equalsIgnoreCase("list")) {
                service.printAll();
            } else if (command.equalsIgnoreCase("remove")) {
                service.remove();
            }
        }
    }
}
