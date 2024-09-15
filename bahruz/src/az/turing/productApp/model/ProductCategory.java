package az.turing.productApp.model;

public enum ProductCategory {
    PHONE(1),
    TV(2),
    PC(3);

    ProductCategory(Integer productNumber) {
        this.productNumber = productNumber;
    }

    private Integer productNumber;

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public static ProductCategory getInstance(int number) {
        for (ProductCategory productCategory : ProductCategory.values()) {

            if (productCategory.getProductNumber() == number) {
                return productCategory;
            }

        }
        throw new IllegalArgumentException("Invalid number !");
    }

}
