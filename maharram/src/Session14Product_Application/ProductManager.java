package Session14Product_Application;

public class ProductManager {
    private Product[] products;
    private int productCount;
    private static final String[] types = {"Soy", "Carrot", "Peas", "Wheat", "Khirnik", "Pear", "Olive", "Urea", "Ammonium Nitrate", "Calcium Nitrate"};
    private static final String[] categorys = {"Ting", "Seed", "Fertilizer"};

    public ProductManager(int capacity) {
        products = new Product[capacity];
        productCount = 0;
    }

    private boolean isValidType(String type1) {
        for (String validtype : types) {
            if (validtype.equals(type1)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidCategory(String category1) {
        for (String validCategory : categorys) {
            if (validCategory.equals(category1)) {
            }
        }
        return false;
    }

    public void addProduct(String name, double price, boolean hasStock, String type, String category) {
        if (!isValidType(type)) {
            System.out.println("Wrong type :" + type);
            return;
        }
        if (!isValidCategory(category)) {
            System.out.println("wrong category :" + category);
            return;
        }
        products[productCount] = new Product(name, category, type, price, hasStock);
        productCount++;
        System.out.println("Product added ");
    }

    public void listProducts() {
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].toString());
        }
    }

    public void listProductsByType(String type) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getType().equals(type)) {
                System.out.println(products[i].toString());
            }
        }
    }

    public void listProductsByCategory(String category) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getCategory().equals(category)) {
                System.out.println(products[i].toString());
            }
        }
    }
}
