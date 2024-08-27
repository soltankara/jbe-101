package session14;

public class ProductManager {
    private Product[] products;
    private int productCount;
    private Category[] categories;
    private int categoryCount;
    private int nextProductId;

    public ProductManager(int maxProducts, int maxCategories, int maxTypes) {
        products = new Product[maxProducts];
        categories = new Category[maxCategories];
        categoryCount = 0;
        nextProductId = 1;
        createDefaultCategories(maxTypes);
    }

    public void createDefaultCategories(int maxTypes) {
        Category toxum = new Category("Toxum", maxTypes);
        toxum.addType("Soya", true);
        toxum.addType("Yerkoku", true);
        toxum.addType("Noxud", false);
        toxum.addType("Bugda", true);
        categories[categoryCount++] = toxum; //istifade et sonra indeksi artir

        Category ting = new Category("Ting", maxTypes);
        ting.addType("Armud", true);
        ting.addType("Zeytun", true);
        ting.addType("Xirnik", false);
        categories[categoryCount++] = ting;

        Category gubre = new Category("Gubre", maxTypes);
        gubre.addType("Karbamid", true);
        gubre.addType("Ammonium nitrat", true);
        gubre.addType("Kalsium nitrat", false);
        categories[categoryCount++] = gubre;
    }

    public void addProduct(String name, double price, boolean hasStock, String typeName, String categoryName) {
        Category category = findCategory(categoryName);
        if (category == null) {
            throw new IllegalArgumentException("Category not found");
        }
        Type type = findType(category, typeName);
        if (type == null || !type.isActive()) {
            throw new IllegalArgumentException("Type not found or not active");
        }
        if (productCount < products.length) {
            Product product = new Product(nextProductId++, name, price, hasStock, type);
            products[productCount++] = product;
            System.out.println("Product added successfully");
        } else {
            System.out.println("Maximum number reached");
        }
    }

    private Category findCategory(String name) {
        for (int i = 0; i < categoryCount; i++) {
            if (categories[i].getName().equalsIgnoreCase(name)) {
                return categories[i];
            }
        }
        return null;
    }

    private Type findType(Category category, String typeName) {
        for (int i = 0; i < category.getTypeCount(); i++) {
            if (category.getTypes()[i].getName().equalsIgnoreCase(typeName)) {
                return category.getTypes()[i];
            }
        }
        return null;
    }

    public void listProducts() {
        if (productCount == 0) {
            System.out.println("Product not available");
        } else {
            for (int i = 0; i < productCount; i++) {
                System.out.println(products[i]);
            }
        }
    }

}
