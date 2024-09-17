package az.turing.productService.service;

import az.turing.productService.data.Base;
import az.turing.productService.menu.MenuUtil;
import az.turing.productService.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ShowProductService implements MenuService {
    @Override
    public void process() {

        int count = 1;
        List<Product> productList = Base.instance().getProductList();

        try {
            Integer productCategory = MenuUtil.getInteger("Enter the category of products you want to see" +
                    "\n1.Phone" +
                    "\n2.TV" +
                    "\n3.PC");
            List<Product> filteredProduct = productList.stream().
                    filter(p -> p.getProductCategory().getProductNumber().equals(productCategory)).collect(Collectors.toList());
            if (filteredProduct.isEmpty()) {
                throw new IllegalArgumentException("ProductList is empty!");
            } else {
                for (Product product : filteredProduct) {
                    System.out.println(count + "." + product);
                    count++;
                }
            }

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println( illegalArgumentException.getLocalizedMessage());
        }
        Base.save();


    }
}
