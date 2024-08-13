package ProductApp;

public class ProductType {
    private String name;
    private boolean isActive;
    private int maxProducts;

    public ProductType(String name, boolean isActive, int maxProducts) {
        this.name = name;
        this.isActive = isActive;
        this.maxProducts = maxProducts;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getMaxProducts() {
        return maxProducts;
    }

    @Override
    public String toString() {
        return name;
    }
}
