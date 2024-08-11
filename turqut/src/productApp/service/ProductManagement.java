package productApp.service;

import java.util.List;

import productApp.model.Product;
import productApp.model.ProductCategory;
import productApp.model.ProductType;

public interface ProductManagement {
    void addProduct(String productName, double price, boolean hasStock, ProductType type, ProductCategory category);

    List<Product> list();

    List<Product> listByCategory(String categoryName);

    List<Product> listByType(String typeName);
}

