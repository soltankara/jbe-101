package Classwork.Service.Impl;

import Classwork.Model.Todo;
import Classwork.Model.TodoStatus;
import Classwork.Service.TodoService;

import java.time.LocalDate;
import java.util.Scanner;

public class TodoServiceImpl implements TodoService {
    private Todo[] todos;
    public TodoServiceImpl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scanner.nextInt();
        todos = new Todo[size];
    }
    public static String getInput() {

        Scanner scanner = null;
        return scanner.nextLine();
    }

    @Override
    public void add() {
        for (int i = 0; i <todos.length; i++) {
            Scanner todoScanner = new Scanner(System.in);
            System.out.print("Title: ");
            String title = todoScanner.nextLine();

            System.out.print("Description: ");
            String description = todoScanner.nextLine();

            System.out.print("Status: ");
            String status = todoScanner.nextLine();

            System.out.print("Due date: ");
            String dueDate = todoScanner.nextLine();

            Todo todo = new Todo(i + 1, title, description, TodoStatus.fromValue(status), LocalDate.parse(dueDate));
            todos[i] = todo;
        }
    }

    @Override
    public Todo[] findAll() {
        return todos;
    }

    @Override
    public void remove() {
        Scanner removeScanner = new Scanner(System.in);
        System.out.print("ID: ");
        Integer id = removeScanner.nextInt();

        for (int i = 0; i < todos.length; i++) {
            if (todos[i].getId().equals(id)) {
                todos[i] = null;
            }
        }
    }

    public Todo[] getTodos() {
        return todos;
    }

    public void setTodos(Todo[] todos) {
        this.todos = todos;
    }
}

