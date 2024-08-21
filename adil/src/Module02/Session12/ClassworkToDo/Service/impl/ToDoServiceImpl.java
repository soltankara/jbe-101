package Module02.Session12.ClassworkToDo.Service.impl;

import Module02.Session12.ClassworkToDo.Entity.ToDo;
import Module02.Session12.ClassworkToDo.Model.ToDoStatus;
import Module02.Session12.ClassworkToDo.Service.ToDoService;

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
        System.out.print("Enter number of action: ");
        int numberOfActions = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfActions; i++) {
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Description: ");
            String description = sc.nextLine();
            LocalDate dueDate;
            while (true) {
                System.out.print("Due date (yyyy-MM-dd): ");
                String date = sc.nextLine();
                try {
                    dueDate = LocalDate.parse(date, formatter);
                } catch (RuntimeException e) {
                    System.out.println("Invalid date format. Try again.");
                    continue;
                }
                if (dueDate.isBefore(LocalDate.now())) {
                    System.out.println("Due date must be in the future. Try again.");
                    continue;
                }
                break;
            }
            ToDoStatus toDoStatus;
            while (true) {
                System.out.print("Status: ");
                String status = sc.nextLine();
                try {
                    toDoStatus = ToDoStatus.getFromValue(status);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid status value. Try again.");
                }
            }
            ToDo toDo = new ToDo(
                    title,
                    description,
                    dueDate,
                    toDoStatus
            );
            if (k == database.length) {
                database = Arrays.copyOf(database, database.length * 2);
            }
            database[k++] = toDo;
            System.out.println("ToDo added successfully.");
        }
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
            try {
                if (database[i].getId() == id) {
                    database[i] = null;
                    System.out.println("ToDo removed successfully.");
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Id not found. Try again.");
                return;
            }
        }
    }
}
