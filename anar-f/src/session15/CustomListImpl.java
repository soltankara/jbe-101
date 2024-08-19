package session15;

import java.util.Arrays;
import java.util.Optional;

public class CustomListImpl <T> implements CustomList {
    T[] elements = (T[]) new Object[10];
    private static int n;

    @Override
    public void add(Object element) {
        elements[n++] = (T) element;
        if (n == elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length);
        }
    }

    @Override
    public void addAll(Object... elements) {
        for (Object element : elements) {
            this.add(element);
        }
    }

    @Override
    public void remove(Object element) {
        for (int i = 0; i < elements.length; i++) {
            Optional <T> opt = Optional.ofNullable(elements[i]);
            if (opt.isPresent() && opt.get().equals(element)) {
                elements[i] = null;
            }
        }
    }

    @Override
    public void print() {
        for (T element : elements){
            if (element != null) {
                System.out.println(element);
            }
        }
    }

    @Override
    public Optional findByIndex(int index) {
        return Optional.ofNullable(elements[index]);
    }

    @Override
    public Object getByIndex(int index) throws Exception {
        T type;
        try {
            type = elements[index];
        }
        catch (RuntimeException e) {
            throw new Exception("Element not found");
        }
        return type;
    }
}
