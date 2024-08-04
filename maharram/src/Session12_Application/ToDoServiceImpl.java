package Session12_Application;

import java.time.LocalDate;
import java.util.Scanner;

public class ToDoServiceImpl implements ToDoService {
    private ToDo[] todos = new ToDo[2];
    private int size = 0;
    private Scanner scanner = new Scanner(System.in);

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

            System.out.print("Status: ");
            String status = scanner.nextLine();

            System.out.print("Due date: ");
            String dueDate = scanner.nextLine();

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
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            if (todos[i].getId() == id) {
                compressArray(i);
                size--;
                break;
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
