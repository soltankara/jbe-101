package Session14.ProductApp;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ProductCategory ve ProductType yaratılması
        ProductCategory electronics = new ProductCategory("Electronics");
        ProductCategory furniture = new ProductCategory("Furniture");

        ProductType laptopType = new ProductType("Laptop", "Active", electronics);
        ProductType phoneType = new ProductType("Smartphone", "Inactive", electronics);
        ProductType chairType = new ProductType("Chair", "Active", furniture);
        ProductType sofaType = new ProductType("Sofa", "Inactive", furniture);

        // ProductManager'ı başlatın ve mehsul elave edilmesi
        ProductManager productManager = new ProductManagerImpl(10); // Maksimum 10 mehsul

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add product");
            System.out.println("2. List products");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Mehsul elave edilmesi
                    System.out.print("Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Product Adı: ");
                    String name = scanner.nextLine();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Is it in stock? (true/false): ");
                    boolean hasStock = scanner.nextBoolean();
                    scanner.nextLine(); //

                    System.out.println("Choose product type: ");
                    System.out.println("1. Laptop");
                    System.out.println("2. Smartphone");
                    System.out.println("3. Chair");
                    System.out.println("4. Sofa");
                    System.out.print("Choice: ");
                    int typeChoice = scanner.nextInt();
                    scanner.nextLine(); //

                    ProductType selectedType = null;
                    switch (typeChoice) {
                        case 1:
                            selectedType = laptopType;
                            break;
                        case 2:
                            selectedType = phoneType;
                            break;
                        case 3:
                            selectedType = chairType;
                            break;
                        case 4:
                            selectedType = sofaType;
                            break;
                        default:
                            System.out.println("Unavailable choice");
                            continue;
                    }
                    // Mehsulu addProduct ile constractor ile elave et
                    productManager.addProduct(id, name, price, hasStock, selectedType, new Date(), new Date());
                    break;

                case 2:
                    // Mehuslu list etme
                    System.out.println("\nProducts in system:");
                    Product[] products = productManager.listProducts();
                    for (Product product : products) {
                        if (product != null) {
                            System.out.println(product);
                        }
                    }
                    break;

                case 3:
                    // Cıxıs
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unavailable choice");
            }
        }
    }
}
