package Session14.ProductApp;

import java.util.Date;

public interface ProductManager {
    void addProduct(int id, String name, double price, boolean hasStock,
                    ProductType productType, Date createdAt, Date modifiedAt);

    Product[] listProducts();
}
