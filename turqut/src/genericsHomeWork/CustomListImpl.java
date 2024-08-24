package genericsHomeWork;

import java.util.Arrays;
import java.util.Optional;


public class CustomListImpl<T> implements CustomList<T> {
    private T[] elements;
    private int size;


    public CustomListImpl() {
        elements = (T[]) new Object[5]; // baslangic olaraq tutum 5di
        size = 0;
    }

    @Override
    public void add(T element) {
        checkCapacity(); // eger 5ci elementden sonraki elementler add olunmaq isteyende yer olsun deye 2ye vuracaq olcunu (metoda bax)
        elements[size++] = element;
    }

    @Override
    public void addAll(T... elements) {
        for (T element : elements) {
            add(element);
        }
    }

    @Override
    public void remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[--size] = null;
                return;
            }
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    @Override
    public Optional<T> findByIndex(int index) {
        if (index >= 0 && index < size) {
            return Optional.ofNullable(elements[index]);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public T getByIndex(int index) throws Exception {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            throw new Exception("Index out of bounds");
        }
    }

    private void checkCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }
}
