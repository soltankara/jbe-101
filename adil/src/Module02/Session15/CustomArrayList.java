package Module02.Session15;

import java.util.Arrays;
import java.util.Optional;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] elements = (T[]) new Object[1];
    private static int k;

    @Override
    public void add(T element) {
        elements[k++] = element;
        if (k == elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length);
        }
    }

    @Override
    public Optional<T> findByIndex(int index) {
        return Optional.ofNullable(elements[index]);
    }

    @Override
    public void print() {
        for (T element : elements) {
            if (element != null) System.out.println(element);
        }
    }

    @Override
    public void remove(T element) {
        for (int i = 0; i < elements.length; i++) {
            Optional<T> optional = Optional.ofNullable(elements[i]);
            if(optional.isPresent() && optional.get().equals(element)) {
                elements[i] = null;
            }
        }
    }
}
