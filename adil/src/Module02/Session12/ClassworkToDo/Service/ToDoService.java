package Module02.Session12.ClassworkToDo.Service;

import Module02.Session12.ClassworkToDo.Entity.ToDo;

import static Module02.Session12.ClassworkToDo.Model.ToDoStatus.isDone;

public interface ToDoService {
    void addToDo();

    void removeToDo();

    ToDo[] getAllToDo();

    default void printAllToDo() {
        for (ToDo toDo : getAllToDo()) {
            if (toDo == null) continue;
            String icon = isDone(toDo.getStatus()) ? "[x]" : "[ ]";
            System.out.printf("%s %s\n", icon, toDo);
        }
    }
}
