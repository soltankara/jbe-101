package az.turing.oop.productApp.service;

import az.turing.oop.productApp.model.Product;
import az.turing.oop.productApp.model.ProductCategory;
import az.turing.oop.productApp.model.ProductType;
import az.turing.oop.productApp.model.Status;
import az.turing.oop.productApp.util.InputUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    public List<ProductCategory> productCategories = new ArrayList<>();
    public List<ProductType> productTypeList = new ArrayList<>();
    public List<Product> productList = new ArrayList<>();

//    public ProductService() {
//        loadCategoriesandTypes();
//    }

    public void loadCategoriesandTypes() {
        ProductCategory electronics = new ProductCategory("Electronics");
        ProductCategory clothes = new ProductCategory("Clothes");
        productCategories.add(electronics);
        productCategories.add(clothes);

        productTypeList.add(new ProductType("TV", electronics, Status.ACTIVE));
        productTypeList.add(new ProductType("Phone", electronics, Status.ACTIVE));
        productTypeList.add(new ProductType("PC", electronics, Status.INACTIVE));
        productTypeList.add(new ProductType("T-Shirt", clothes, Status.ACTIVE));
        productTypeList.add(new ProductType("Shoes", clothes, Status.ACTIVE));
        productTypeList.add(new ProductType("Jacket", clothes, Status.INACTIVE));
    }

    public List<Product> productList() {
        return productList;
    }

    public List<Product> getProductCategoryList(String categoryName) {
        return productList.stream().
                filter(p -> p.getProductCategory().getCategoryName().equalsIgnoreCase(categoryName)).collect(Collectors.toList());

    }

    public List<Product> getTypeList(String typeName) {
        return productList.stream().
                filter(p -> p.getProductType().getTypeName().equalsIgnoreCase(typeName)).collect(Collectors.toList());
    }

    public Product fillProduct() {
        Integer productID = InputUtil.getCount("Enter the Product ID");
        String productName = InputUtil.getText("Enter the product name");
        Double productPrice = InputUtil.getPrice("Enter the product price");

        System.out.println("Select the category: Electronics/Clothes");
        String productCategory = InputUtil.getText("Enter the product category");

        ProductCategory foundCategory = null;
        ProductType foundType = null;

        for (ProductCategory category : productCategories) {
            if (category.getCategoryName().equalsIgnoreCase(productCategory)) {
                foundCategory = category;
                break;
            }
        }

        if (foundCategory == null) {
            throw new IllegalArgumentException("Category not found!");
        }

        String chooseType = "";
        switch (productCategory.toLowerCase()) {
            case "electronics":
                chooseType = InputUtil.getText("Select the type: TV/Phone/PC");
                break;
            case "clothes":
                chooseType = InputUtil.getText("Select the type: T-Shirt/Shoes/Jacket");
                break;
            default:
                throw new IllegalArgumentException("Category not found!");
        }
        for (ProductType type : productTypeList) {
            if (type.getTypeName().equalsIgnoreCase(chooseType)
                    && type.getProductCategory().equals(foundCategory)
                    && type.getStatus().equals(Status.ACTIVE)) {
                foundType = type;
                break;
            }
        }

        if (foundType == null) {
            throw new IllegalArgumentException("Type not found or inactive!");
        }

        LocalDate productDate = LocalDate.now();

        return new Product(productID, productName, productPrice, foundType, foundCategory, productDate);
    }




}
