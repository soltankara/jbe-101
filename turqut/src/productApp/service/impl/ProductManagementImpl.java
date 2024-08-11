package productApp.service.impl;

import java.util.ArrayList;
import java.util.List;

import productApp.model.Product;
import productApp.model.ProductCategory;
import productApp.model.ProductType;
import productApp.model.Status;
import productApp.service.ProductManagement;


public class ProductManagementImpl implements ProductManagement {
    private ArrayList<Product> ProductList = new ArrayList<>();

    @Override
    public void addProduct(String productName, double price, boolean hasStock, ProductType type, ProductCategory category) {
        if (type.getStatus() == Status.ACTIVE) {
            ProductList.add(new Product(productName, price, hasStock, type, category));
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Sorry, the product type " + type.getTypeName() + " is INACTIVE and cannot be added.");
        }
    }

    @Override
    public List<Product> list() {
        return new ArrayList<>(ProductList);
    }

    @Override
    public List<Product> listByCategory(String categoryName) {
        List<Product> result = new ArrayList<>();
        for (Product product : ProductList) {
            if (product.getProductCategory().getCategoryName().equalsIgnoreCase(categoryName)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public List<Product> listByType(String typeName) {
        List<Product> result = new ArrayList<>();
        for (Product product : ProductList) {
            if (product.getProductType().getTypeName().equalsIgnoreCase(typeName)) {
                result.add(product);
            }
        }
        return result;
    }
}
