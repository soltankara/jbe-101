package productApp.model;

public class ProductType {
    private String typeName;
    private Status status;

    public ProductType(String typeName, Status status) {
        this.typeName = typeName;
        this.status = status;
    }

    public String getTypeName() {
        return typeName;
    }

    public Status getStatus() {
        return status;
    }
}
