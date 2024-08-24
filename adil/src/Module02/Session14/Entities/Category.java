package Module02.Session14.Entities;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    List<Type> types = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Type> getProductTypes() {
        return types;
    }

    public void setProductTypes(List<Type> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return name;
    }
}
