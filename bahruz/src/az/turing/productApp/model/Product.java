package az.turing.productApp.model;

import java.io.Serializable;

public class Product implements Serializable {

    private Integer productId;
    private String productName;
    private Double productPrice;
    private Integer productCount;
    private ProductCategory productCategory;

    public Integer getProductId() {
        return productId;
    }

    public Product(Integer productId, String productName, Double productPrice, Integer productCount, ProductCategory productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product {" + "productId: " + productId + " ,productName: " + productName +
                " ,productPrice: " + productPrice + " ,productCount: " + productCount + " ,productCategory: " + productCategory;
    }
}
