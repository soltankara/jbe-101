package session12.service;


import session12.model.Todo;

import static session12.model.TodoStatus.isDone;

public interface TodoService {
    void add();

    Todo[] findAll();

    void remove();

    default void printAll() {
        for (Todo todo : findAll()) {
            if (todo == null) {
                continue;
            }
            String icon = isDone(todo.getStatus()) ? "[x]" : "[ ]";
            System.out.printf("%s %s", icon, todo);
            System.out.println();
        }
    }
}
