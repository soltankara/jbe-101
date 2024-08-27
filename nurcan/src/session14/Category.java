package session14;

import java.util.Arrays;

public class Category {
    private String name;
    private Type[] types;
    private int typeCount;

    public Category(String name, int maxCount) {
        this.name = name;
        this.types = new Type[maxCount];
        this.typeCount = 0;
    }

    public void addType(String typeName, boolean isActive) {
        if (typeCount < types.length) {
            types[typeCount] = new Type(typeName, this, isActive);
            typeCount++;
        } else {
            System.out.println("Maximum number reached");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeCount() {
        return typeCount;
    }

    public void setTypeCount(int typeCount) {
        this.typeCount = typeCount;
    }

    public Type[] getTypes() {
        return types;
    }

    public void setTypes(Type[] types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", types=" + Arrays.toString(types) +
                ", typeCount=" + typeCount +
                '}';
    }
}
