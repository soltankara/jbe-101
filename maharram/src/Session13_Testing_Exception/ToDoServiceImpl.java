package Session13_Testing_Exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ToDoServiceImpl implements ToDoService {
    private ToDo[] todos = new ToDo[2];
    private int size = 0;
    private Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    @Override
    public void add(int count) {
        for (int i = 0; i < count; i++) {
            if (size == todos.length) {
                expandArray();
            }

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();


            String status;
            while (true) {
                System.out.print("Status: ");
                status = scanner.nextLine();
                if (status.equalsIgnoreCase("done") || status.equalsIgnoreCase("pending")) {
                    break;
                } else {
                    try {
                        throw new InvalidException("Invalid status: " + status);
                    } catch (InvalidException ex) {
                        System.out.println(ex.getMessage());
                        System.out.println("Please enter a valid status (pending or done).");
                    }
                }
            }

            String dueDate;
            while (true) {
                System.out.print("Due date: ");
                dueDate = scanner.nextLine();
                try {
                    LocalDate parsedDate = LocalDate.parse(dueDate, formatter);
                    break;
                } catch (DateTimeParseException ex) {
                    System.out.println("Invalid format: " + dueDate);
                    System.out.println("Please enter the correct date format (yyyy-MM-dd)  ");
                }
            }


            ToDo todo = new ToDo(size + 1, title, description, ToDoStatus.fromValue(status), LocalDate.parse(dueDate));
            todos[size] = todo;
            size++;
        }
    }

    @Override
    public ToDo[] findAll() {
        ToDo[] currentTodos = new ToDo[size];
        System.arraycopy(todos, 0, currentTodos, 0, size);
        return currentTodos;
    }

    @Override
    public void remove() {
        while (true) {
            try {
                System.out.print("id: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < size; i++) {
                    if (todos[i].getId() == id) {
                        compressArray(i);
                        size--;
                        found = true;
                        break;
                    }
                }

                if (found) {
                    break;
                } else {
                    throw new InvalidException("Invalid id: " + id);
                }
            } catch (InvalidException ex) {
                System.out.println(ex.getMessage());
                System.out.print("Please enter a valid id: ");
                for (int i = 0; i < size; i++) {
                    System.out.print(todos[i].getId() + " ");
                }
                System.out.println();
            }
        }
    }

    private void expandArray() {
        ToDo[] newTodos = new ToDo[todos.length * 2];
        for (int i = 0; i < todos.length; i++) {
            newTodos[i] = todos[i];
        }
        todos = newTodos;
    }

    private void compressArray(int index) {
        for (int i = index; i < size - 1; i++) {
            todos[i] = todos[i + 1];
        }
        todos[size - 1] = null;
    }
}
