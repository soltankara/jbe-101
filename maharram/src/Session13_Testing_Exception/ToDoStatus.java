package Session13_Testing_Exception;

public enum ToDoStatus {
    PENDING("Pending"),
    DONE("Done");

    private String value;

    ToDoStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ToDoStatus fromValue(String value) {
        for (ToDoStatus todoStatus : values()) {
            if (todoStatus.value.equalsIgnoreCase(value)) {
                return todoStatus;
            }
        }
        return null;
    }

    public static boolean isDone(ToDoStatus status) {
        return status == DONE;
    }
}
