//package classwork.service;
//
//import classwork.model.Todo;
//import classwork.model.TodoStatus;
//import classwork.service.TodoService;
//
//import javax.swing.text.DateFormatter;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//public class TodoServiceImpl implements TodoService {
//
//    Todo[] todos = new Todo[2];
//    Scanner scanner = new Scanner(System.in);
//
//    @Override
//    public void add() {
//        for (int i = 0; i < 2; i++) {
//            System.out.print("Title: ");
//            String title = scanner.nextLine();
//
//            System.out.print("Description: ");
//            String description = scanner.nextLine();
//
//            System.out.print("Status: ");
//            String status = scanner.nextLine();
//            TodoStatus todoStatus;
//            try{
//                todoStatus = TodoStatus.fromValue(status);
//            } catch (IllegalArgumentException error){
//                System.out.println("Error occured. " + error.getMessage());
//                continue;
//            }
//
//            System.out.print("Due date: ");
//            String dueDate = scanner.nextLine();
//            LocalDate parsedData;
//            try{
//                parsedData = LocalDate.parse(dueDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//            } catch (Exception error){
//                System.out.println("The invalid type. Please enter the date as yyyy-MM-dd.");
//                continue;
//            }
//
//            Todo todo = new Todo(i + 1, title, description, TodoStatus.fromValue(status), LocalDate.parse(dueDate));
//            todos[i] = todo;
//        }
//    }
//
//    @Override
//    public Todo[] findAll() {
//        return todos;
//    }
//
//    @Override
//    public void remove() {
//        Scanner removeScanner = new Scanner(System.in);
//        System.out.print("ID: ");
//        Integer id = removeScanner.nextInt();
//
//        for (int i = 0; i < todos.length; i++) {
//            if (todos[i].getId().equals(id)) {
//                todos[i] = null;
//            }
//        }
//    }
//}
package classwork.service;

import classwork.model.Todo;
import classwork.model.TodoStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TodoServiceImpl implements TodoService {

    Todo[] todos = new Todo[2];
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        for (int i = 0; i < 2; i++) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();

            System.out.print("Status: ");
            String status = scanner.nextLine();
            TodoStatus todoStatus;
            try {
                todoStatus = TodoStatus.fromValue(status);
            } catch (IllegalArgumentException error) {
                System.out.println("Error occurred: " + error.getMessage());
                continue;
            }

            System.out.print("Due date (yyyy-MM-dd): ");
            String dueDate = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate parsedDate;
            try {
                parsedDate = LocalDate.parse(dueDate, formatter);
            } catch (Exception error) {
                System.out.println("Invalid date format. Please enter date in the form shown.");
                continue;
            }

            Todo todo = new Todo(i + 1, title, description, todoStatus, parsedDate);
            todos[i] = todo;
        }
    }

    @Override
    public Todo[] findAll() {
        return todos;
    }

    @Override
    public void remove() {
        System.out.print("ID: ");
        Integer id = scanner.nextInt();

        for (int i = 0; i < todos.length; i++) {
            if (todos[i] != null && todos[i].getId().equals(id)) {
                todos[i] = null;
                System.out.println("Todo with ID " + id + " removed.");
                return;
            }
        }
        System.out.println("Todo with ID " + id + " not found.");
    }
}
