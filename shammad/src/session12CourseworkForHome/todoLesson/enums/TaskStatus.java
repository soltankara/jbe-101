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

    public static TaskStatus fromValue(String value) throws IllegalArgumentException{
        for (TaskStatus ts : values()) {
            if (ts.value.equalsIgnoreCase(value)) return ts;
        }
        throw new IllegalArgumentException(String.format("no valid argument found for: %s", value));
//        return null;
    }

    public static boolean isDone(TaskStatus ts) {
        return ts == DONE;
    }
}
