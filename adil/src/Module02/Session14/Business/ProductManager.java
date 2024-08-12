package Module02.Session14.Business;

import Module02.Session14.DataAccess.CategoryDao;
import Module02.Session14.DataAccess.ProductDao;
import Module02.Session14.DataAccess.TypeDao;
import Module02.Session14.Entities.Product;
import Module02.Session14.Entities.Category;
import Module02.Session14.Entities.Type;

import java.util.List;
import java.util.Scanner;

public class ProductManager implements ProductService {
    Scanner sc = new Scanner(System.in);
    ProductDao productDao = new ProductDao();
    CategoryDao categoryDao = new CategoryDao();
    TypeDao typeDao = new TypeDao();

    @Override
    public void addProduct() {
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Is product available? (Y/N): ");
        boolean hasStock = sc.next().equals("Y");
        sc.nextLine();
        String type;
        Type productType;
        while (true) {
            System.out.print("Enter product type: ");
            type = sc.nextLine().toLowerCase();
            try {
                productType = typeDao.getByName(type);
                if (!productType.isActive()) {
                    System.out.println("Type is not active. Try again.");
                    continue;
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Try again");
            }
        }
        String category;
        Category productCategory;
        while (true) {
            System.out.print("Enter product category: ");
            category = sc.nextLine().toLowerCase();
            try {
                productCategory = categoryDao.findCategoryByName(category);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Try again");
                continue;
            }
            boolean flag = false;
            for (Type type1 : productCategory.getProductTypes()) {
                if (type1.getName().equalsIgnoreCase(type)) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
            System.out.printf("There is no \"%s\" type in this category. Try again.\n", type);
        }
        Product product = new Product(name, price, hasStock);
        productDao.save(product);
        List<Product> products = productType.getProducts();
        products.add(product);
        Type newType = productType;
        newType.setProducts(products);
        typeDao.save(newType);
        List<Type> types = productCategory.getProductTypes();
        types.remove(productType);
        types.add(newType);
        productCategory.setProductTypes(types);
        categoryDao.update(productCategory);
    }

    @Override
    public void addCategory(String category) {
        category = category.toLowerCase();
        Category productCategory = new Category(category);
        categoryDao.save(productCategory);
    }

    @Override
    public void addProductType(String productType, String categoryName, boolean isActive) {
        productType = productType.toLowerCase();
        categoryName = categoryName.toLowerCase();
        Category category = categoryDao.findCategoryByName(categoryName);
        Type type = new Type(productType, categoryName, isActive);
        typeDao.save(type);
        List<Type> productTypes = category.getProductTypes();
        productTypes.add(type);
        category.setProductTypes(productTypes);
        categoryDao.update(category);
    }

    @Override
    public void listCategory() {
        System.out.print("Enter category name: ");
        String category = sc.nextLine().toLowerCase();
        Category productCategory = categoryDao.findCategoryByName(category);
        for (Type type : productCategory.getProductTypes()) {
            for (Product product : type.getProducts()) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void listProducts() {
        for (Product product : productDao.list()) {
            System.out.println(product);
        }
    }

    @Override
    public void listProductType() {
        System.out.print("Enter product type: ");
        String type = sc.nextLine().toLowerCase();
        Type productType = typeDao.getByName(type);
        for (Product product : productType.getProducts()) {
            System.out.println(product);
        }

    }
}
