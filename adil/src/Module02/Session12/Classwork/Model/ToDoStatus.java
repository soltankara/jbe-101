package Module02.Session12.Classwork.Model;

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

    public static ToDoStatus getFromValue(String value) {
        for (ToDoStatus toDoStatus : values()) {
            if (toDoStatus.getValue().equalsIgnoreCase(value)) {
                return toDoStatus;
            }
        }
        return null;
    }

    public static boolean isDone(ToDoStatus status) {
        return status == DONE;
    }
}
