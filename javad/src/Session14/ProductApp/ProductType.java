package Session14.ProductApp;

public class ProductType {
    private String name;
    private String status;
    private ProductCategory productCategory; // Her ProductType bir ProductCategory'ye ait

    public ProductType(String name, String status, ProductCategory productCategory) {
        this.name = name;
        this.status = status;
        this.productCategory = productCategory;
    }

    // Getter ve Setter'lar
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}

