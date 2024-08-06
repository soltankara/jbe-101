package turqut.src.w3oop;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public void checkInventory() {
        for (Product product : products) {
            System.out.println("In inventory there are " + product.getQuantity() + " " + product.getName() + ".");
        }
    }
}
