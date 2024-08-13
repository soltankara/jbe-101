package Module02.Session14.DataAccess;

import Module02.Session14.DataAccess.abstracts.Dao;
import Module02.Session14.Entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDao implements Dao<Category> {
    public static final List<Category> categories = new ArrayList<>();

    @Override
    public void save(Category category) {
        try {
            Category oldType = findByName(category.getName());
            int index = categories.indexOf(oldType);
            categories.set(index, category);
        } catch (IllegalArgumentException e) {
            categories.add(category);
        }
    }

    public Category findByName(String name) {
        for (Category category : categories) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        throw new IllegalArgumentException("Category not found.");
    }
}
