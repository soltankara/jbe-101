package ProductApp;

public class ProductCategory {
    private String name;
    private ProductType[] productTypes;
    private int typeCount;

    public ProductCategory(String name, int maxTypes) {
        this.name = name;
        this.productTypes = new ProductType[maxTypes];
        this.typeCount = 0;
    }

    public String getName() {
        return name;
    }

    public boolean addProductType(ProductType type) {
        if (typeCount < productTypes.length) {
            productTypes[typeCount++] = type;
            return true;
        }
        return false;
    }

    public ProductType findProductTypeByName(String typeName) {
        for (int i = 0; i < typeCount; i++) {
            if (productTypes[i].getName().equalsIgnoreCase(typeName) && productTypes[i].isActive()) {
                return productTypes[i];
            }
        }
        return null;
    }
}

