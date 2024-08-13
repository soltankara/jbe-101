package productsHomework.repository;

import productsHomework.entity.Product;
import productsHomework.entity.ProductCategory;
import productsHomework.entity.ProductType;
import productsHomework.enums.Status;
import productsHomework.exceptions.CapacityIsFullException;

import java.util.NoSuchElementException;

public class ProductRepository {
    private ProductCategory[] categories;
    private ProductType[] types;
    private Product[] products;
    private int elementCount = 0;
    private int index = 0;

    public ProductRepository(Integer size) {
        this.products = new Product[size];
        this.categories = new ProductCategory[2];
        this.types = new ProductType[6];
    }

    public void addProduct(Product product) {
        products[index] = product;
        elementCount++;
        index++;
    }

    public boolean isNotFull() throws CapacityIsFullException {
        if (index > (products.length - 1)) {
            throw new CapacityIsFullException("Repository is full. Cannot add another product.");
        }
        return true;
    }

    public boolean isEmpty() {
        return (products[0] == null);
    }

    public ProductType findTypeByName(String typeName) throws NoSuchElementException {
        for (ProductType type : types) {
            if (type.getName().equalsIgnoreCase(typeName))
                return type;
        }
        throw new NoSuchElementException("Type does not exists.");
    }

    public ProductCategory findCategoryByName(String categoryName) throws NoSuchElementException {
        for (ProductCategory category : categories) {
            if (category.getName().equalsIgnoreCase(categoryName))
                return category;
        }
        throw new NoSuchElementException("Category does not exists.");
    }

    public void initializeCategoriesAndTypes() {
        ProductCategory toxum = new ProductCategory("Toxum");
        ProductCategory ting = new ProductCategory("Ting");
        categories[0] = toxum;
        categories[1] = ting;

        ProductType soya = new ProductType("Soya", toxum, Status.ACTIVE);
        ProductType yerkoku = new ProductType("Yerkoku", toxum, Status.INACTIVE);
        ProductType noxud = new ProductType("Noxud", toxum, Status.ACTIVE);

        ProductType armud = new ProductType("Armud", ting, Status.ACTIVE);
        ProductType zeytun = new ProductType("Zeytun", ting, Status.ACTIVE);
        ProductType ximik = new ProductType("Ximik", ting, Status.INACTIVE);

        types[0] = soya;
        types[1] = yerkoku;
        types[2] = noxud;
        types[3] = armud;
        types[4] = zeytun;
        types[5] = ximik;
    }

    public ProductCategory[] getCategories() {
        return categories;
    }

    public void setCategories(ProductCategory[] categories) {
        this.categories = categories;
    }

    public ProductType[] getTypes() {
        return types;
    }

    public void setTypes(ProductType[] types) {
        this.types = types;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getElementCount() {
        return elementCount;
    }

    public void setElementCount(int elementCount) {
        this.elementCount = elementCount;
    }
}
