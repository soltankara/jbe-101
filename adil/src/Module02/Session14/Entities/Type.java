package Module02.Session14.Entities;

import java.util.ArrayList;
import java.util.List;

public class Type {
    private String name;
    private String categoryName;
    private boolean active;
    private List<Product> products = new ArrayList<>();

    public Type(String name, String categoryName, boolean active) {
        this.name = name;
        this.categoryName = categoryName;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
