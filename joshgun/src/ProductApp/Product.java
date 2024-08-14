package ProductApp;

import java.time.LocalDateTime;

public class Product {
    private int id;
    private String name;
    private double price;
    private boolean hasStock;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private ProductType productType;

    public Product(int id, String name, double price, boolean hasStock, ProductType productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hasStock = hasStock;
        this.productType = productType;
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", hasStock=" + hasStock +
                ", productType=" + productType +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    public String getCategoryName() {
        return productType.getName();
    }

    public String getTypeName() {
        return productType.getName();
    }
}
