package az.turing.oop.productApp.dao.inter;

import az.turing.oop.productApp.model.Product;

import java.util.List;

public interface ProductDaoInter {


    public void productAdd(Product product);


    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String categoryName);

    List<Product> getProductsByTypeList(String typeName);


}
