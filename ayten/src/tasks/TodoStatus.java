package tasks;

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
    public static TodoStatus fromValue(String value){
        for (TodoStatus todoStatus : values()) {
            if(todoStatus.value.equalsIgnoreCase(value)){
                return  todoStatus;
            }
        }
        throw new IllegalArgumentException("todo status not fund");
    }
}
