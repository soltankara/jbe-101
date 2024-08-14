package session15;

import java.util.Arrays;
import java.util.Optional;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] elements;
    private int size;

    public CustomArrayList() {
        elements = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2); //ölçüsünü 2 qat artırmaq
        }
        elements[size++] = element;
    }

    @Override
    public void addAll(T[] elements) {
        for (T element : elements) {
            add(element);
        }
    }

    @Override
    public void remove(Object element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];//hemin elementden baslayaraq bir sonraki ile evez edilme
                }
                elements[--size] = null;
                return;
            }
        }
    }

    @Override
    public void print() {
        for (T element : elements) {
            if (element == null) {
                continue;
            }
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public Optional findByIndex(int index) {
        if (index >= 0 && index < size) {
            return Optional.of(elements[index]);
        }
        return Optional.empty();
    }

    @Override
    public T getByIndex(int index) throws Exception {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
