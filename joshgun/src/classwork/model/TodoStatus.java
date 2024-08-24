package classwork.model;

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

    public static TodoStatus fromValue(String value) throws IllegalArgumentException {
        for (TodoStatus todoStatus : values()) {
            if (todoStatus.value.equalsIgnoreCase(value)) {
                return todoStatus;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid status %s ", value));
    }

    public static boolean isDone(TodoStatus status) {
        return status == DONE;
    }
}
