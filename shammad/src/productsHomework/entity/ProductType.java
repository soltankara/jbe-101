package productsHomework.entity;

import productsHomework.enums.Status;
import productsHomework.exceptions.CategoryDoesNotMatchException;

public class ProductType {
    private String name;
    private ProductCategory category;
    private Status status;

    public ProductType(String name, ProductCategory category, Status status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }

    public void verifyCategory(ProductCategory category) throws CategoryDoesNotMatchException {
        if (!(this.category.getName().equalsIgnoreCase(category.getName())))
            throw new CategoryDoesNotMatchException("Given category does not match actual category.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
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
                "name='" + name + '\'' +
                ", category=" + category +
                ", status=" + status +
                '}';
    }
}