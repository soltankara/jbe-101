package classwork.service;

import classwork.model.Todo;

import static classwork.model.TodoStatus.isDone;

public interface TodoService {

    void add();

    Todo[] findAll();

    void remove();

    default void printAll() {
        for (Todo todo : findAll()) {

            if (todo == null) {
                continue;
            }

            String icon = isDone(todo.getStatus())
                    ? "[x]"
                    : "[ ]";

            System.out.printf("%s %s", icon, todo);
            System.out.println();
        }
    }
}
