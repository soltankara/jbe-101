package Module02.Session12.ClassworkToDo.Model;

public enum ToDoStatus {
    DONE("done"),
    PENDING("pending");
    private String value;

    ToDoStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ToDoStatus getFromValue(String value) throws IllegalArgumentException {
        for (ToDoStatus toDoStatus : values()) {
            if (toDoStatus.getValue().equalsIgnoreCase(value)) {
                return toDoStatus;
            }
        }
        throw new IllegalArgumentException("Invalid status value");
    }

    public static boolean isDone(ToDoStatus status) {
        return status == DONE;
    }
}
