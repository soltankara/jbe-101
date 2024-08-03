package Module02.Session12.Classwork.Service.impl;

import Module02.Session12.Classwork.Entity.ToDo;
import Module02.Session12.Classwork.Model.ToDoStatus;
import Module02.Session12.Classwork.Service.ToDoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoServiceImpl implements ToDoService {
    private ToDo[] database = new ToDo[10];
    private static int k = 0;
    Scanner sc = new Scanner(System.in);

    @Override
    public void addToDo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Description: ");
        String description = sc.nextLine();
        LocalDate dueDate;
        while (true){
            System.out.print("Due date (yyyy-MM-dd): ");
            String date = sc.nextLine();
            try {
                dueDate = LocalDate.parse(date, formatter);
            } catch (Exception e) {
                System.out.println("Invalid date format. Try again.");
                continue;
            }
            if (dueDate.isBefore(LocalDate.now())) {
                System.out.println("Due date must be in the future. Try again.");
                continue;
            }
            break;
        }
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("\n");
        ToDo toDo = new ToDo(
                title,
                description,
                dueDate,
                ToDoStatus.getFromValue(status)
        );
        if (k == database.length) {
            database = Arrays.copyOf(database, database.length * 2);
        }
        database[k++] = toDo;
    }

    @Override
    public ToDo[] getAllToDo() {
        return database;
    }

    @Override
    public void removeToDo() {
        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < database.length; i++) {
            if (database[i].getId() == id) {
                database[i] = null;
                break;
            }
        }
    }
}
