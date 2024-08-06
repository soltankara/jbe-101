package session12.service.impl;


import session12.model.Todo;
import session12.model.TodoStatus;
import session12.service.TodoService;

import java.time.LocalDate;
import java.util.Scanner;

public class TodoServiceImpl implements TodoService {

    Todo[] todos = new Todo[2];

    @Override
    public void add() {
        for (int i = 0; i < 2; i++) {
            Scanner addScanner = new Scanner(System.in);

            System.out.print("Title: ");
            String title = addScanner.nextLine();

            System.out.print("Description: ");
            String description = addScanner.nextLine();

            System.out.print("Status: ");
            String status = addScanner.nextLine();

            System.out.print("Due date: ");
            String dueDate = addScanner.nextLine();

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

    @Override
    public void printAll() {
        TodoService.super.printAll();
    }
}
