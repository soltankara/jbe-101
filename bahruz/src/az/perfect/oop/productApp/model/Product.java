package az.perfect.oop.productApp.model;

import java.time.LocalDate;

public class Product {

    private Integer productId;
    private String productName;
    private Double productPrice;
    private ProductType productType;
    private ProductCategory productCategory;
    private LocalDate localDate;

    public Product(Integer productId, String productName, Double productPrice, ProductType productType, ProductCategory productCategory, LocalDate localDate) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
        this.productCategory = productCategory;
        this.localDate = localDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Product { " + "productId: " + productId + " ,productName: " + productName +
                " ,productPrice:" + productPrice + " ,productType: " + productType + " ,localDate=" + localDate + '}';
    }
}
