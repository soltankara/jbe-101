package az.turing.oop.productApp.model;

public class ProductType {

    private String typeName;
    private ProductCategory productCategory;
    private Status status;

    public ProductType(String typeName, ProductCategory productCategory, Status status) {
        this.typeName = typeName;
        this.productCategory = productCategory;
        this.status = status;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "typeName='" + typeName + '\'' +
                ", productCategory=" + productCategory +
                ", status=" + status +
                '}';
    }
}
