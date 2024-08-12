package Module02.Session14.Business;

public interface ProductService {
    void addProduct();

    void addCategory(String category);

    void addProductType(String productType, String categoryName, boolean isActive);

    void listProducts();

    void listCategory();

    void listProductType();
}
