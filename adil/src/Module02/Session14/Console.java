package Module02.Session14;

import Module02.Session14.Business.ProductManager;
import Module02.Session14.Business.ProductService;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        ProductService productService = new ProductManager();
        Scanner sc = new Scanner(System.in);
        productService.addCategory("Toxum");
        productService.addCategory("Ting");
        productService.addCategory("Gübrə");
        productService.addProductType("Soya", "Toxum", true);
        productService.addProductType("Yerkökü", "Toxum", true);
        productService.addProductType("Noxud", "Toxum", true);
        productService.addProductType("Buğda", "Toxum", true);
        productService.addProductType("Armud", "Ting", true);
        productService.addProductType("Zeytun", "Ting", true);
        productService.addProductType("Xirnik", "Ting", true);
        productService.addProductType("Karbamid", "Gübrə", true);
        productService.addProductType("Ammonium nitrat", "Gübrə", true);
        productService.addProductType("Kalsium nitrat", "Gübrə", true);

        while (true) {
            System.out.print("\nCommand: ");
            String command = sc.nextLine().toLowerCase().trim();
            switch (command) {
                case "quit":
                    return;
                case "add":
                    productService.addProduct();
                    break;
                case "list":
                    productService.listProducts();
                    break;
                case "list category":
                    productService.listCategory();
                    break;
                case "list type":
                    productService.listProductType();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}

