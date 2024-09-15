package az.turing.productApp.service;

import az.turing.productApp.data.Base;
import az.turing.productApp.menu.MenuUtil;
import az.turing.productApp.model.Product;

import java.util.List;

public class FindProductService implements MenuService {
    @Override
    public void process() {
        try {
            List<Product> getAllProducts = Base.instance().getProductList();
            if (getAllProducts.isEmpty()) {
                throw new IllegalArgumentException("ProductList is empty");
            }
            String text = MenuUtil.getText("Write you want to find product! Enter the ProductName");
            for (Product product : getAllProducts) {
                if (text.equalsIgnoreCase(product.getProductName())) {
                    System.out.println(product);
                }
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
        }


    }
}
