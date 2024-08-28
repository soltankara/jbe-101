package az.turing.oop.productApp.model;

public class ProductCategory {

    private String categoryName;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "ProductCategory { " + "categoryName: " + categoryName + '}';
    }
}
