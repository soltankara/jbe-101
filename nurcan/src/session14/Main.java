package session14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProductManager pm = new ProductManager(10, 3, 5);
        while (true) {
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            System.out.print("Has Stock (true/false): ");
            boolean hasStock = scan.nextBoolean();
            System.out.print("Type name: ");
            String typeNAme = scan.next();
            System.out.print("Category name: ");
            String categoryName = scan.next();

            try {
                pm.addProduct(name, price, hasStock, typeNAme, categoryName);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Do you want to continue? (yes/no) : ");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("All products: ");
        pm.listProducts();
    }

}
