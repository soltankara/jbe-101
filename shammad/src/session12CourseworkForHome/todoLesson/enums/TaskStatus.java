package session12CourseworkForHome.todoLesson.enums;

public enum TaskStatus {
    DONE("Done"),
    PENDING("Pending");

    private String value;

    TaskStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TaskStatus fromValue(String value) {
        for (TaskStatus ts : values()) {
            if (ts.value.equalsIgnoreCase(value)) return ts;
        }
        return null;
    }

    public static boolean isDone(TaskStatus ts) {
        return ts == DONE;
    }
}
