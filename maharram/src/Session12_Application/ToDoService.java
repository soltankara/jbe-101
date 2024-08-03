package Session12_Application;

public interface ToDoService {
    void add(int count);

    ToDo[] findAll();

    void remove();

    default void printAll() {
        for (ToDo todo : findAll()) {
            if (todo == null) {
                continue;
            }
            String icon = ToDoStatus.isDone(todo.getStatus()) ? "[x]" : "[ ]";
            System.out.printf("%s %s%n", icon, todo);
        }
    }
}
