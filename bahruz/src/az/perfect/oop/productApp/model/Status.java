package az.perfect.oop.productApp.model;

public enum Status {

    ACTIVE("Active"),
    INACTIVE("Inactive");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
