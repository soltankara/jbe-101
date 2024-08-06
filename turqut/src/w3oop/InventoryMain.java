package turqut.src.w3oop;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("Apple", 50);
        Product product2 = new Product("Banana", 100);
        Product product3 = new Product("Cherry", 320);

        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);

        System.out.println("Inventory information : ");
        inventory.checkInventory();

        inventory.remove(product2);

        System.out.println("Inventory information after removing Banana : ");
        inventory.checkInventory();
    }
}
