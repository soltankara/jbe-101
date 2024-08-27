package session12.model;

public enum InformationStatus {
    PENDING("Pending"),
    DONE("Done");
    private String status;

    InformationStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static boolean isDone(InformationStatus status) {
        return status == DONE;
    }
}
