package Session13.Impl;


import Session13.Model.Todo;
import Session13.Model.TodoStatus;
import Session13.Service.TodoService;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.in;

public class TodoServiceImpl implements TodoService {
    Todo[] todos = new Todo[2];

    @Override
    public void add() {
        for (int i = 0; i < 2; i++) {
            Scanner todoScanner = new Scanner(in);
            System.out.print("Enter the title:\n");
            String title = todoScanner.nextLine();

            System.out.print("Enter the description:\n");
            String description = todoScanner.nextLine();

            System.out.print("Enter the status:\n");
            String status = todoScanner.nextLine();

            System.out.print("Enter the due date:\n");
            String dueDate = todoScanner.nextLine();
            //Todonun yerine var da olar simvol sayi cox olmasin deye ist olunur
            Todo todo = new Todo(i + 1, title, description, TodoStatus.fromvalue(status), LocalDate.parse(dueDate));
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
}