package Classworks;

public class Box<T> {
    private final T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
