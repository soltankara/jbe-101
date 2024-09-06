package az.turing.productApp.data;

import az.turing.productApp.fileutility.FileUtility;
import az.turing.productApp.model.Product;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Base implements Serializable {

    private List<Product> productList = new LinkedList<>();
    private HashMap<String, String> users = new HashMap<>();
    public static boolean logeddin;

    public static Base base = null;

    public HashMap<String, String> getUsers() {
        return users;
    }

    public static void save() {
        FileUtility.writeObjectToFile(base, "app.obj");
    }

    public static void initialize() {
        try {
            Object obj = FileUtility.readObjectFromFile("app.obj");
            if (obj instanceof Base) {
                base = (Base) obj;
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void setUsers(String username, String password) {
        this.users.put(username, password);
    }

    public static Base instance() {
        if (base == null) {
            base = new Base();
        }
        return base;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(Product product) {
        this.productList.add(product);
    }
}
