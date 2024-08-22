package az.perfect.oop.productApp.main;

import az.perfect.oop.productApp.dao.impl.ProductDaoImpl;
import az.perfect.oop.productApp.exception.CategoryException;
import az.perfect.oop.productApp.exception.ProductListException;
import az.perfect.oop.productApp.model.Product;
import az.perfect.oop.productApp.service.ProductService;
import az.perfect.oop.productApp.util.InputUtil;

public class Main {

    public static void main(String[] args) {

        ProductDaoImpl productDao = new ProductDaoImpl();
        ProductService productService = new ProductService();

        while (true) {

            Integer command = InputUtil.getCount("Enter the command:" +
                    "\n1.ProductAdd" +
                    "\n2.List" +
                    "\n3.ListCategory" +
                    "\n4.ListType" +
                    "\n5.Exit");

            switch (command) {
                case 1:
                    Product product = productService.fillProduct();
                    productDao.productAdd(product);
                    System.out.println("Product was added succesfuly");
                    break;
                case 2:
                    try {
                        System.out.println(productDao.getAllProducts());
                    } catch (IllegalArgumentException illegalArgumentException) {
                        System.out.println(illegalArgumentException.getLocalizedMessage());
                    }
                    break;
                case 3:
                    try {
                        String categoryList = InputUtil.getText("CategoryName");
                        if (!categoryList.equalsIgnoreCase("electronics") && !categoryList.equals("clothes")) {
                            throw new CategoryException("Category not found!");
                        }

                        System.out.println(productDao.getProductsByCategory(categoryList));
                    } catch (IllegalArgumentException | CategoryException illegalArgumentException) {
                        System.out.println(illegalArgumentException.getLocalizedMessage());
                    }
                    break;
                case 4:
                    try {
                        String typeList = InputUtil.getText("TypeList");
                        if (!typeList.equalsIgnoreCase("Phone") && !typeList.equalsIgnoreCase("TV")
                                && !typeList.equalsIgnoreCase("PC") && !typeList.equals("T-Shirt")
                                && !typeList.equalsIgnoreCase("Shoes") && !typeList.equalsIgnoreCase("jacket")) {
                            throw new ProductListException("Typelist not found!");
                        }
                        System.out.println(productDao.getProductsByTypeList(typeList));
                    } catch (IllegalArgumentException |ProductListException illegalArgumentException) {
                        System.out.println(illegalArgumentException.getLocalizedMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid input!");

            }


        }
    }
}
