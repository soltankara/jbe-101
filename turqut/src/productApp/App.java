package productApp;

import java.util.Scanner;


import productApp.model.Product;
import productApp.model.ProductCategory;
import productApp.model.ProductType;
import productApp.model.Status;
import productApp.service.ProductManagement;
import productApp.service.impl.ProductManagementImpl;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagement pm = new ProductManagementImpl();

        ProductCategory electronicsCategory = new ProductCategory("Electronics");
        ProductType smartphone = new ProductType("Smartphone", Status.ACTIVE);
        ProductType tablet = new ProductType("Tablet", Status.ACTIVE);
        ProductType laptop = new ProductType("Laptop", Status.ACTIVE);

        ProductCategory clothingCategory = new ProductCategory("Clothing");
        ProductType tShirt = new ProductType("T-Shirt", Status.ACTIVE);
        ProductType pants = new ProductType("Pants", Status.ACTIVE);
        ProductType jacket = new ProductType("Jacket", Status.INACTIVE);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Please enter product name: ");
                    String productName = sc.nextLine();
                    System.out.print("Please enter product price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Is product in stock (true/false): ");
                    boolean hasStock = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Please enter product category (Electronics or Clothing): ");
                    String categoryChoice = sc.nextLine();
                    if (categoryChoice.equalsIgnoreCase("Electronics")) {
                        System.out.println("Please enter product type (Smartphone, Tablet, or Laptop): ");
                        String typeChoice = sc.nextLine();
                        switch (typeChoice.toLowerCase()) {
                            case "smartphone":
                                pm.addProduct(productName, price, hasStock, smartphone, electronicsCategory);
                                break;
                            case "tablet":
                                pm.addProduct(productName, price, hasStock, tablet, electronicsCategory);
                                break;
                            case "laptop":
                                pm.addProduct(productName, price, hasStock, laptop, electronicsCategory);
                                break;
                            default:
                                System.out.println("Invalid product type.");
                        }
                    } else if (categoryChoice.equalsIgnoreCase("Clothing")) {
                        System.out.println("Please enter product type (T-Shirt, Pants, or Jacket): ");
                        String typeChoice = sc.nextLine();
                        switch (typeChoice.toLowerCase()) {
                            case "t-shirt":
                                pm.addProduct(productName, price, hasStock, tShirt, clothingCategory);
                                break;
                            case "pants":
                                pm.addProduct(productName, price, hasStock, pants, clothingCategory);
                                break;
                            case "jacket":
                                pm.addProduct(productName, price, hasStock, jacket, clothingCategory);
                                break;
                            default:
                                System.out.println("Invalid product type.");
                        }
                    } else {
                        System.out.println("Invalid category.");
                    }
                    break;
                case 2:
                    System.out.println("Please select list option: (list, list category::{categoryName}, list type::{typeName}): ");
                    String listChoice = sc.nextLine();
                    if (listChoice.equalsIgnoreCase("list")) {
                        for (Product product : pm.list()) {
                            System.out.println("Product ID: " + product.getId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice() + ", Has Stock: " + product.isHasStock() + ", Created at: " + product.getCreatedAt());
                        }
                    } else if (listChoice.startsWith("list category::")) {
                        String categoryName = listChoice.split("::")[1].trim();
                        for (Product product : pm.listByCategory(categoryName)) {
                            System.out.println("Product ID: " + product.getId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice() + ", Has Stock: " + product.isHasStock() + ", Created at: " + product.getCreatedAt());
                        }
                    } else if (listChoice.startsWith("list type::")) {
                        String typeName = listChoice.split("::")[1].trim();
                        for (Product product : pm.listByType(typeName)) {
                            System.out.println(product);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

