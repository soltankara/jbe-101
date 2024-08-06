package session11W3resourceOOP;
public class Inventory {
    private String[] products;
    private int countOfProduct;
    private int lowStockThreshold;
    public Inventory(int maxCountOfProduct, int lowStockThreshold) {
        this.products = new String[maxCountOfProduct];
        this.lowStockThreshold = lowStockThreshold;
        this.countOfProduct = 0;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }

    public int getLowStockThreshold() {
        return lowStockThreshold;
    }

    public void setLowStockThreshold(int lowStockThreshold) {
        this.lowStockThreshold = lowStockThreshold;
    }

    public void addProduct(String product) {
        if (countOfProduct < products.length) {
            products[countOfProduct] = product;
            countOfProduct++;
            System.out.println(product + " added ");
        } else {
            System.out.println("there is not enough place for product");
        }
    }
    public void removeProduct(String product) {
        boolean found = false;
        for (int i = 0; i < countOfProduct; i++) {
            if (products[i].equals(product)) {
                found = true;
            }
            for (int j = i; j < countOfProduct - 1; j++) {
                products[j] = products[j + 1];
            }
            products[countOfProduct - 1] = null;
            countOfProduct--;
            System.out.println(product + " removed");
            break;
        }
        if (!found) {
            System.out.println(product + "was not found ");
        }
    }
    public void checkLowInventory() {
        if (countOfProduct < lowStockThreshold) {
            System.out.println("low product :  There is " + countOfProduct + " product");
        } else {
            System.out.println(" everything is okay ");
        }
    }
    public void showProducts() {
        System.out.print("products : ");
        for (int i = 0; i < countOfProduct; i++) {
            System.out.print(products[i] + "  ");
        }
        System.out.println();
    }
}
