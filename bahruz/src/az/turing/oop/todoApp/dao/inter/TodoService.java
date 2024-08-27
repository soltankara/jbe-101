package az.turing.oop.todoApp.dao.inter;

import az.turing.oop.todoApp.model.Todo;
import az.turing.oop.todoApp.model.TodoStatus;

public interface TodoService {

    void add();

    void findCommand();

    void changeCommandValue();


    Todo[] findAll();

    void remove();

    default void printAll() {
        for (Todo todo : findAll()) {

            if (todo == null) {
                continue;
            }

            String icon = TodoStatus.isDone(todo.getStatus()) ? "[x]" : "[ ]";
            System.out.printf("%s,%s", icon, todo);
            System.out.println();

        }

    }
}
