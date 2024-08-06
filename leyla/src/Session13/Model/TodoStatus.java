package Session13.Model;

public enum TodoStatus {

    PENDING("Pending"),
    DONE("Done");

    private final String value;

    TodoStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TodoStatus fromvalue(String value) {
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
