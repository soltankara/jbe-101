package Module02.Session14.DataAccess;

import Module02.Session14.DataAccess.abstracts.Dao;
import Module02.Session14.Entities.Type;

import java.util.ArrayList;
import java.util.List;

public class TypeDao implements Dao<Type> {
    private static List<Type> types = new ArrayList<>();

    @Override
    public void save(Type type) {
        try {
            Type oldType = getByName(type.getName());
            int index = types.indexOf(oldType);
            types.set(index, type);
        }catch (IllegalArgumentException e){
            types.add(type);
        }
    }

    public List<Type> list() {
        return types;
    }

    public Type getByName(String name) {
        for (Type type : types) {
            if (type.getName().equals(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Type not found.");
    }
}
