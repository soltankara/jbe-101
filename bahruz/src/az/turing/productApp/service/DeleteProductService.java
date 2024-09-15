package az.turing.productApp.service;

import az.turing.productApp.data.Base;
import az.turing.productApp.menu.MenuUtil;
import az.turing.productApp.model.Product;
import az.turing.productApp.model.ProductCategory;

import java.util.List;

public class DeleteProductService implements MenuService {
    @Override
    public void process() {
        try {
            List<Product> getAllProducts = Base.instance().getProductList();
            if (getAllProducts.isEmpty()) {
                throw new IllegalArgumentException("ProductList is empty");
            }
            System.out.println("Which category do you want to remove products from?" +
                    "1.TV 2.Phone 3.PC");
            Integer categoryId = MenuUtil.getInteger("Enter the CategoryID");
            Integer deleteProductId = MenuUtil.getInteger("Enter the productId you want to delete!") - 1;
            Product product = getAllProducts.get(deleteProductId);
            if (deleteProductId >= 0 && deleteProductId < getAllProducts.size()) {
                if (product.getProductCategory().getProductNumber().equals(categoryId)) {
                    getAllProducts.remove(product);
                    System.out.println("Product has been deleted");
                    Base.save();
                }
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
        }




    }
}
