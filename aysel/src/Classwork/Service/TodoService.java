package Classwork.Service;

import Classwork.Model.Todo;
import Classwork.Model.TodoStatus;

public interface TodoService {
    void add();

    Todo[] findAll();

    void remove();

    default void printAll() {
        for (Todo todo : findAll()) {

            if (todo == null) {
                continue;
            }

            String icon = TodoStatus.isDone(todo.getStatus())
                    ? "[x]"
                    : "[ ]";

            System.out.printf("%s %s", icon, todo);
            System.out.println();
        }
    }
}
