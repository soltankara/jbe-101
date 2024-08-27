package session12.service;

import Information.model.Information;
import Information.model.InformationStatus;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class InformationServiceImpl implements InformationService {
    Scanner scan = new Scanner(System.in);
    int times;
    Information[] inf;

    public InformationServiceImpl() {
        System.out.println("How many times you want to add information? ");
        times = scan.nextInt();
        inf = new Information[times];
    }

    @Override
    public void add() {
        for (int i = 0; i < times; i++) {
            System.out.print("Title: ");
            String title = scan.next();
            System.out.print("Description: ");
            String description = scan.next();
            System.out.print("Due date: ");
            String dueDate = scan.next();
            System.out.print("Status: ");
            String status = scan.next().toUpperCase(Locale.ENGLISH);
            inf[i] = new Information(i + 1, title, description, LocalDate.parse(dueDate), InformationStatus.valueOf(status));
            System.out.println("Please add to do information");
        }
    }

    @Override
    public void remove() {
        System.out.print("Enter id: ");
        Integer id = scan.nextInt();
        for (int i = 0; i < times; i++) {
            if (inf[i].getId() == id) {
                inf[i] = inf[inf.length - 1];
                inf[inf.length - 1] = null;
                times = times - 1;
            }
        }
        System.out.println("Information deleted");
    }

    @Override
    public Information[] findAll() {
        return inf;
    }
}
