package az.perfect.oop.todoApp.model;

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
        return null;
    }

    public static boolean isDone(TodoStatus status) {
        return status == DONE;
    }

}
