package session14;

import java.time.Instant;
import java.time.LocalDateTime;

public class Product {
    private final int id;
    private String name;
    private double price;
    private boolean hasStock;
    private final Type type;
    private final LocalDateTime createdAt;
    private Instant modifiedAt;

    public Product(int id, String name, double price, boolean hasStock, Type type) {
        if (type == null || !type.isActive()) {
            throw new IllegalArgumentException("Type is not active or valid");
        }
        this.id = id;
        this.name = name;
        this.price = price;
        this.hasStock = hasStock;
        this.type = type;
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = Instant.now();
    }

    public void updateProduct(String name, double price, boolean hasStock) {
        this.name = name;
        this.price = price;
        this.hasStock = hasStock;
        this.modifiedAt = Instant.now();
    }

    @Override
    public String toString() {
        return "id = " + id +"\n"+
                "name = " + name + "\n" +
                "price = " + price +"\n"+
                "hasStock = " + hasStock +"\n"+
                "type = " + type.getName() +"\n"+
                "createdAt = " + createdAt +"\n"+
                "modifiedAt = " + modifiedAt;
    }
}
