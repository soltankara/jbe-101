package Session14.ProductApp;

public class ProductCategory {
    private String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."ProductCategory{name='\{name}\{'\''}\{'}'}";
    }

    // Getter ve Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

