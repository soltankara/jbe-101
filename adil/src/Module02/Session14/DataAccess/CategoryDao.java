package Module02.Session14.DataAccess;

import Module02.Session14.DataAccess.abstracts.Dao;
import Module02.Session14.Entities.Category;
import Module02.Session14.Entities.Type;

import java.util.ArrayList;
import java.util.List;

public class CategoryDao implements Dao<Category> {
    public static List<Category> categories = new ArrayList<>();

    @Override
    public void save(Category category) {
        categories.add(category);
    }

    public Category findCategoryByName(String name) {
        for (Category category : categories) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        throw new IllegalArgumentException("Category not found.");
    }

    public void update(Category category) {
        Category oldCategory = findCategoryByName(category.getName());
        int index = categories.indexOf(oldCategory);
        categories.set(index, category);
    }
}
