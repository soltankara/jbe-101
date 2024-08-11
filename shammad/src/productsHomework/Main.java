package productsHomework;

import productsHomework.repository.ProductRepository;
import productsHomework.service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductRepository productRepository = new ProductRepository(10);
        ProductService service = new ProductService(productRepository);

        System.out.println("Welcome to the program!");

        while (true) {
            System.out.println("Please select an operation: ");
            String selection = scanner.nextLine().trim();
            if (selection.equalsIgnoreCase("add")) {
                service.addProduct();
            } else if (selection.startsWith("list category::")) {
                String categoryToSearch = selection.substring(15).trim();
                service.listProductsByCategory(categoryToSearch);
            } else if (selection.startsWith("list type::")) {
                String typeToSearch = selection.substring(11).trim();
                service.listProductsByType(typeToSearch);
            } else if (selection.equalsIgnoreCase("list")) {
                service.listAllProducts();
            } else if (selection.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid input. try again.");
            }
        }
    }
}