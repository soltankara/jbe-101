package az.turing.productApp.service;

import az.turing.productApp.data.Base;
import az.turing.productApp.menu.MenuUtil;
import az.turing.productApp.model.Product;
import az.turing.productApp.model.ProductCategory;

public class AddProductService implements MenuService {
    @Override
    public void process() {
        Integer productId = MenuUtil.getInteger("Enter the productId");
        String producctName = MenuUtil.getText("Enter the productName");
        Double productPrice = MenuUtil.getDouble("Enter the productPrice");
        Integer productCount = MenuUtil.getInteger("Enter the productCount");
        Integer categoryID = MenuUtil.getInteger("Enter the CategiryId");
        ProductCategory productCategory = ProductCategory.getInstance(categoryID);
        Product product = new Product(productId, producctName, productPrice, productCount, productCategory);
        Base.instance().setProductList(product);
        Base.save();

    }
}
