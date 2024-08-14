package ProductApp;

import java.util.Scanner;

public class MainPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager(3);

        ProductCategory toxum = new ProductCategory("Toxum", 4);
        ProductType soya = new ProductType("Soya", true, 10);
        ProductType yerkoku = new ProductType("Yerkökü", true, 10);
        toxum.addProductType(soya);
        toxum.addProductType(yerkoku);

        ProductCategory ting = new ProductCategory("Ting", 3);
        ProductType armud = new ProductType("Armud", true, 10);
        ting.addProductType(armud);

        ProductCategory gubre = new ProductCategory("Gübrə", 3);
        ProductType karbamid = new ProductType("Karbamid", true, 10);
        gubre.addProductType(karbamid);

        manager.addCategory(toxum);
        manager.addCategory(ting);
        manager.addCategory(gubre);

        String command = "";

        while (!command.equalsIgnoreCase("exit")) {
            System.out.print("Enter command (add/list/exit): ");
            command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("add")) {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine().trim();

                System.out.print("Enter product price: ");
                double price = scanner.nextDouble();

                System.out.print("Is product in stock? (true/false): ");
                boolean hasStock = scanner.nextBoolean();
                scanner.nextLine();

                System.out.print("Enter product type name: ");
                String typeName = scanner.nextLine().trim();

                System.out.print("Enter product category name: ");
                String categoryName = scanner.nextLine().trim();

                manager.addProduct(name, price, hasStock, typeName, categoryName);

            } else if (command.startsWith("list")) {
                String[] parts = command.split("::");
                if (parts.length == 1) {
                    manager.listProducts();
                } else if (parts.length == 2) {
                    if (parts[0].equalsIgnoreCase("list category")) {
                        manager.listProductsByCategory(parts[1].trim());
                    } else if (parts[0].equalsIgnoreCase("list type")) {
                        manager.listProductsByType(parts[1].trim());
                    } else {
                        System.out.println("Invalid list command.");
                    }
                } else {
                    System.out.println("Invalid list command format.");
                }
            } else if (!command.equalsIgnoreCase("exit")) {
                System.out.println("Invalid command.");
            }
        }

        System.out.println("Exiting program.");
        scanner.close();
    }
}


