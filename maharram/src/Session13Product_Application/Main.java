package Session13Product_Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     ProductManager productManager = new ProductManager(80);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Menu :");
            System.out.println("enter 1 for add product ");
            System.out.println("enter 2 to see all product");
            System.out.println("enter 3 to see products by category");
            System.out.println("enter 4 to see products by type ");
            System.out.println("enter 5 for end program ");
            System.out.print("your choice  : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("enter the name of product : ");
                    String name = sc.nextLine();
                    System.out.print("enter the price of product: ");
                    double price = sc.nextDouble();
                    System.out.print("is the product in stock? (true/false): ");
                    boolean hasStock = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("enter the type of product: ");
                    String type = sc.nextLine();
                    System.out.print("enter the category of product: ");
                    String category = sc.nextLine();

                    productManager.addProduct(name, price, hasStock, type, category);
                    break;
                case 2:
                    System.out.print("all products:");
                    productManager.listProducts();
                    break;
                case 3:
                    System.out.print("enter the name of category: ");
                    String categoryInput = sc.nextLine();
                    System.out.println(categoryInput + "the products which belong to category:");
                    productManager.listProductsByCategory(categoryInput);
                    break;
                case 4:
                    System.out.print("enter the name of type: ");
                    String typeInput = sc.nextLine();
                    System.out.println(typeInput + " the product which belong to type:");
                    productManager.listProductsByType(typeInput);
                    break;
                case 5:
                    System.out.println("Program ending...");
                    sc.close();
                    return;
                default:
                    System.out.println("wrong choice ,pls try again ");
            }
        }















    }
}
