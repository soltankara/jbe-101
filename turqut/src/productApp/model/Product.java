package productApp.model;

import java.time.Instant;
import java.time.LocalDateTime;

public class Product {
    private static Integer idCounter = 1;
    private Integer id;
    private String productName;
    private double price;
    private boolean hasStock;
    private LocalDateTime createdAt;
    private Instant modifiedAt;
    private ProductType productType;
    private ProductCategory productCategory;

    public Product(String productName, double price, boolean hasStock, ProductType productType, ProductCategory productCategory) {
        this.id = idCounter++;
        this.productName = productName;
        this.price = price;
        this.hasStock = hasStock;
        this.productType = productType;
        this.productCategory = productCategory;
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = Instant.now();
    }

    public Integer getId() {
        return id;
    }


    public String getProductName() {
        return productName;
    }


    public double getPrice() {
        return price;
    }


    public boolean isHasStock() {
        return hasStock;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public ProductType getProductType() {
        return productType;
    }


    public ProductCategory getProductCategory() {
        return productCategory;
    }
}
