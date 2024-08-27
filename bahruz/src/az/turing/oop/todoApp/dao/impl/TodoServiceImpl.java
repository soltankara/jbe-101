package az.turing.oop.todoApp.dao.impl;

import az.turing.oop.todoApp.dao.inter.TodoService;
import az.turing.oop.todoApp.exception.TodoException;
import az.turing.oop.todoApp.model.Todo;
import az.turing.oop.todoApp.model.TodoStatus;
import az.turing.oop.todoApp.util.InputUtil;

import java.time.LocalDate;

public class TodoServiceImpl implements TodoService {
    private Todo todolist[];

    @Override
    public void add() {
        try {
            Integer countCommand = InputUtil.getCount("Enter the count");
            if (countCommand <= 0) {
                throw new TodoException("Enter the positive count!");
            }

           todolist = new Todo[countCommand];

            for (int i = 0; i < countCommand; i++) {
                String title = InputUtil.getText("Title");
                String description = InputUtil.getText("Description");
                String status = InputUtil.getText("Status");
                String dueDate = InputUtil.getText("DueDate");

                Todo todo = new Todo(i + 1, title, description, TodoStatus.fromIsValue(status), LocalDate.parse(dueDate));
                todolist[i] = todo;
            }
        } catch (TodoException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Override
    public void findCommand() {

        String text = InputUtil.getText("Write title or description");
        boolean found = false;


        for (Todo todo : todolist) {
            if (todo != null && todo.getTitle().equalsIgnoreCase(text) ||
                    todo.getDescription().equalsIgnoreCase(text)) {
                System.out.println(todo);
                found = true;

            }

        }

        if (!found) {
            System.out.println("Command not found!");
            found = false;
        }
    }

    @Override
    public void changeCommandValue() {

        int commandİd = InputUtil.getCount("Enter the CommandId");
        try {
            if (commandİd <= 0) {
                throw new IllegalArgumentException("Enter the positive CommandID!");
            }
            String commandValue = InputUtil.getText("Enter the value you want to change:" +
                    "title / description / status / dueDate");
            boolean found = false;

            for (Todo todo : todolist) {
                if (todo != null && todo.getId().equals(commandİd)) {
                    found = true;
                    if (commandValue.equalsIgnoreCase("title")) {
                        todo.setTitle(InputUtil.getText("Enter the new title"));
                    } else if (commandValue.equalsIgnoreCase("description")) {
                        todo.setDescription(InputUtil.getText("Enter the new description"));
                    } else if (commandValue.equalsIgnoreCase("status")) {
                        String newStatus = InputUtil.getText("Enter the new status");
                        todo.setStatus(TodoStatus.valueOf(newStatus.toUpperCase()));

                    } else if (commandValue.equalsIgnoreCase("dueDate")) {
                        todo.setDueDate(LocalDate.parse(InputUtil.getText("Enter the new dueDate")));

                    }
                } else {
                    System.out.println("CommandId not found!");
                }
            }
        } catch (TodoException todoException) {
            System.out.println(todoException.getMessage());
        }
    }

    @Override
    public Todo[] findAll() {

        return todolist;
    }


    @Override
    public void remove() {

        try {
            Integer removeId = InputUtil.getCount("RemoveID");
            if (removeId <= 0) {
                throw new TodoException("RemoveID not found");
            }
            for (int i = 0; i < todolist.length; i++) {
                if (todolist[i].getId() != null && todolist[i].getId() == removeId) {
                    todolist[i] = null;
                }

            }

        } catch (TodoException todoException) {
            System.out.println(todoException.getMessage());

        }


    }
}

