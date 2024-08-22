package az.perfect.oop.productApp.dao.impl;

import az.perfect.oop.productApp.dao.inter.ProductDaoInter;
import az.perfect.oop.productApp.model.Product;
import az.perfect.oop.productApp.service.ProductService;

import java.util.List;

public class ProductDaoImpl implements ProductDaoInter {
    ProductService productService = new ProductService();

    @Override
    public void productAdd(Product product) {
        productService.productList().add(product);
    }

    @Override
    public List<Product> getAllProducts() {
        if (productService.productList.isEmpty()) {
            throw new IllegalArgumentException("ProductList is empty");
        } else {
            return productService.productList;
        }

    }

    @Override
    public List<Product> getProductsByCategory(String categoryName) {
        if (productService.productList.isEmpty()) {
            throw new IllegalArgumentException("ProductList is empty");
        } else {
            return productService.getProductCategoryList(categoryName);
        }
    }

    @Override
    public List<Product> getProductsByTypeList(String typeName) {
        if (productService.productList.isEmpty()) {
            throw new IllegalArgumentException("ProductList is empty");
        } else {
            return productService.getTypeList(typeName);
        }
    }
}
