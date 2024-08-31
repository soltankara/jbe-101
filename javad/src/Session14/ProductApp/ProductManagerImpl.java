package Session14.ProductApp;

import java.util.Arrays;
import java.util.Date;

public class ProductManagerImpl implements ProductManager {
    private Product[] products;
    private int count;

    public ProductManagerImpl(int size) {
        this.products = new Product[size];
        this.count = 0;
    }

    @Override
    public String toString() {
        return STR."ProductManagerImpl{products=\{Arrays.toString(products)}, count=\{count}\{'}'}";
    }

    @Override
    public void addProduct(int id, String name, double price, boolean hasStock,
                           ProductType productType, Date createdAt, Date modifiedAt) {
        if ("Active".equalsIgnoreCase(productType.getStatus())) {
            if (count < products.length) {
                products[count] = new Product(id, name, price, hasStock, createdAt, modifiedAt, productType);
                count++;
                System.out.println("Product added successfully: " + name);
            } else {
                System.out.println("List is full. New product cannot be added");
            }
        } else {
            System.out.println("No product added: " + name + " - ProductType is Inactive.");
        }
    }

    @Override
    public Product[] listProducts() {
        return products;
    }
}
