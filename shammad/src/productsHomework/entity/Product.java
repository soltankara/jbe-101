package productsHomework.entity;

import java.time.Instant;
import java.time.LocalDate;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private boolean hasStock;
    private Instant createdAt;
    private LocalDate modifiedAt;
    private ProductType productType;

    public Product(Integer id, String name, Double price, boolean hasStock, Instant createdAt, LocalDate modifiedAt, ProductType productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hasStock = hasStock;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.productType = productType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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

    public LocalDate getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
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
                ", productType=" + productType +
                '}';
    }
}
