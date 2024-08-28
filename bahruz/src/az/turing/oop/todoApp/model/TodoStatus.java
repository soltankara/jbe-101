package az.turing.oop.todoApp.model;

import az.turing.oop.todoApp.exception.TodoException;

public enum TodoStatus {

    DONE("Done"),
    PENDING("Pending");

    private String value;

    TodoStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TodoStatus fromIsValue(String value) {
        for (TodoStatus todoStatus : values()) {
            if (todoStatus.value.equalsIgnoreCase(value)) {
                return todoStatus;

            }
        }
        throw new TodoException("Could not find value for TodoStatus ");

    }

    public static boolean isDone(TodoStatus status) {
        return status == DONE;
    }

}
