package Session15_Generics;

import java.util.ArrayList;
import java.util.Optional;

public class MyCustomArrayList<T> implements CustomList<T> {
    private ArrayList<T> list;

    public MyCustomArrayList() {
        list = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        list.add(element);
        System.out.println(element + " added. ");
    }

    @Override
    public void addAll(T... elements) {
        for (T element : elements) {
            list.add(element);
            System.out.println(element + " added. ");
        }
    }

    @Override
    public void remove(T element) {
        list.remove(element);
        System.out.println(element + " deleted.");
    }

    @Override
    public void print() {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public Optional<T> findByIndex(int index) {
        if (index >= 0 && index < list.size()) {
            return Optional.of(list.get(index));
        }
        return Optional.empty();
    }

    @Override
    public T getByIndex(int index) throws Exception {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        throw new Exception("index out of bounds");
    }
}
