package Session13Product_Application;

public class Product {
    String name;
    String category;
    String type;
    double price;
    boolean hasStock;

    public Product(String name, String category, String type, double price, boolean hasStock) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.price = price;
        this.hasStock = hasStock;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", hasStock=" + hasStock +
                '}';
    }
}
