package Classwork.Model;

public enum TodoStatus {
    PENDING("Pending"),
    DONE("Done");

    private String value;

    TodoStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TodoStatus fromValue(String value) {
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

