package session14;

public class Type {
    private String name;
    private Category category;
    private boolean isActive;

    public Type(String name, Category category, boolean isActive) {
        this.name = name;
        this.category = category;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", isActive=" + isActive +
                '}';
    }
}
