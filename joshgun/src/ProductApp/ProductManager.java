package ProductApp;

public class ProductManager {
    private ProductCategory[] categories;
    private Product[] products;
    private int productCount;
    private int categoryCount;

    public ProductManager(int maxCategories) {
        this.categories = new ProductCategory[maxCategories];
        this.products = new Product[100];
        this.productCount = 0;
        this.categoryCount = 0;
    }

    public boolean addCategory(ProductCategory category) {
        if (categoryCount < categories.length) {
            categories[categoryCount++] = category;
            return true;
        }
        return false;
    }

    public void addProduct(String name, double price, boolean hasStock, String typeName, String categoryName) {
        ProductCategory category = findCategoryByName(categoryName);
        if (category == null) {
            System.out.println("Category not found: " + categoryName);
            return;
        }

        ProductType type = category.findProductTypeByName(typeName);
        if (type == null) {
            System.out.println("Product type not found or inactive: " + typeName);
            return;
        }

        if (productCount < products.length) {
            products[productCount++] = new Product(productCount, name, price, hasStock, type);
        } else {
            System.out.println("Product list is full.");
        }
    }

    public void listProducts() {
        if (productCount == 0) {
            System.out.println("No products available.");
            return;
        }
        System.out.println("All Products:");
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i]);
        }
    }

    public void listProductsByCategory(String categoryName) {
        ProductCategory category = findCategoryByName(categoryName);
        if (category == null) {
            System.out.println("Category not found: " + categoryName);
            return;
        }

        boolean found = false;
        System.out.println("Products in '" + categoryName + "' category:");
        for (int i = 0; i < productCount; i++) {
            if (products[i].getCategoryName().equalsIgnoreCase(categoryName)) {
                System.out.println(products[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found in this category.");
        }
    }

    public void listProductsByType(String typeName) {
        boolean found = false;
        System.out.println("Products in '" + typeName + "' type:");
        for (int i = 0; i < productCount; i++) {
            if (products[i].getTypeName().equalsIgnoreCase(typeName)) {
                System.out.println(products[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found in this type.");
        }
    }

    private ProductCategory findCategoryByName(String name) {
        for (int i = 0; i < categoryCount; i++) {
            if (categories[i].getName().equalsIgnoreCase(name)) {
                return categories[i];
            }
        }
        return null;
    }
}
