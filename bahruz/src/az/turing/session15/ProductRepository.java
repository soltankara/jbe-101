package az.turing.session15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    List<Product> productList = new ArrayList<>();

    public void productAdd() {
        productList.add(new Product(1, "14Pro"));
        productList.add(new Product(2, "LG200"));
    }

    public Optional<List<Product>> getProductList() {
        return productList.isEmpty() ? Optional.empty() : Optional.of(productList);
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
