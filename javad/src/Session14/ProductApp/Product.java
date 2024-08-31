package Session14.ProductApp;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private double price;
    private boolean hasStock;
    private Date createdAt;
    private Date modifiedAt;
    private ProductType productType; // Her Product bir ProductType'a aiddi

    public Product(int id, String name, double price, boolean hasStock, Date createdAt, Date modifiedAt, ProductType productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hasStock = hasStock;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return STR."Product{id=\{id}, name='\{name}\{'\''}, price=\{price}, hasStock=\{hasStock}, createdAt=\{createdAt}, modifiedAt=\{modifiedAt}, productType=\{productType}\{'}'}";
    }

    // Getter ve Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
