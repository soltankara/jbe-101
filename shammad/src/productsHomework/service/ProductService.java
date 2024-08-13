package productsHomework.service;

import productsHomework.entity.Product;
import productsHomework.entity.ProductCategory;
import productsHomework.entity.ProductType;
import productsHomework.enums.Status;
import productsHomework.exceptions.CapacityIsFullException;
import productsHomework.exceptions.CategoryDoesNotMatchException;
import productsHomework.exceptions.InactiveProductTypeException;
import productsHomework.repository.ProductRepository;

import java.time.Instant;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ProductService {
    private ProductRepository repo;

    public ProductService(ProductRepository productRepository) {
        this.repo = productRepository;
        productRepository.initializeCategoriesAndTypes();
    }

    public void listAllProducts() {
        if (repo.isEmpty()) {
            System.out.println("Empty. No products exists.");
            return;
        }

        for (int i = 0; i < repo.getElementCount(); i++) {
            System.out.println(repo.getProducts()[i]);
        }
    }

    public void listProductsByCategory(String categoryToSearch) {
        if (repo.isEmpty()) {
            System.out.println("Empty. No products exists.");
            return;
        }

        boolean notFound = true;

        for (int i = 0; i < repo.getElementCount(); i++) {
            if (repo.getProducts()[i].getProductType().getCategory().getName().equalsIgnoreCase(categoryToSearch)) {
                System.out.println(repo.getProducts()[i]);
                notFound = false;
            }
        }

        if (notFound)
            System.out.println("There is no products with given category.");
    }

    public void listProductsByType(String typeToSearch) {
        if (repo.isEmpty()) {
            System.out.println("Empty. No products exists.");
            return;
        }

        boolean notFound = true;

        for (int i = 0; i < repo.getElementCount(); i++) {
            if (repo.getProducts()[i].getProductType().getName().equalsIgnoreCase(typeToSearch)) {
                System.out.println(repo.getProducts()[i]);
                notFound = false;
            }
        }
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        try {
            if (repo.isNotFull()) {
                System.out.print("Enter the product name: ");
                String productName = scanner.nextLine();

                System.out.print("Enter price of product: ");
                Double price = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Does it have stock? (yes/no): ");
                String choice = scanner.nextLine();
                if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
                    throw new IllegalArgumentException("Invalid argument passed.");
                boolean hasStock = choice.equalsIgnoreCase("yes") ? true : false;

                System.out.print("Enter name of product type: ");
                String typeNameInString = scanner.nextLine();
                ProductType type = repo.findTypeByName(typeNameInString);
                if (Status.isInactive(type.getStatus()))
                    throw new InactiveProductTypeException("Selected type is inactive");

                System.out.print("Enter product category: ");
                String category = scanner.nextLine();
                ProductCategory categoryByName = repo.findCategoryByName(category);
                type.verifyCategory(categoryByName);

                Product product = new Product(repo.getIndex(), productName, price, hasStock, Instant.now(), LocalDate.now(), type);
                repo.addProduct(product);
                System.out.println("Product has been added.");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong (invalid) input. Reverting back to menu");
        } catch (
                CapacityIsFullException |
                IllegalArgumentException |
                NoSuchElementException |
                InactiveProductTypeException |
                CategoryDoesNotMatchException exception
        ) {
            System.out.printf("%s\n Reverting back to menu.\n", exception.getMessage());
        }
    }

    public ProductRepository getProductRepository() {
        return repo;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.repo = productRepository;
    }
}
