package Module02.Session14.DataAccess;

import Module02.Session14.DataAccess.abstracts.Dao;
import Module02.Session14.Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Dao<Product> {
    private static List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    public List<Product> list() {
        return products;
    }
}
