package Module02.Session14.Entities;

import java.time.Instant;

public class Product {
    private final int id;
    private String name;
    private double price;
    private boolean hasStock;
    private Instant createdAt;
    private Instant modifiedAt;
    private static int idGenerator = 1;

    public Product(String name, double price, boolean hasStock) {
        this.id = idGenerator++;
        this.name = name;
        this.price = price;
        this.hasStock = hasStock;
        this.createdAt = Instant.now();
        this.modifiedAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasStock() {
        return hasStock;
    }

    public void setHasStock(boolean hasStock) {
        this.hasStock = hasStock;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Instant modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", hasStock=" + hasStock +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}
