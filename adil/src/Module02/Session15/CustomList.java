package Module02.Session15;

import java.util.Optional;

public interface CustomList<T> {

    void add(T element);

    default void addAll(T... elements){
        for (T element : elements) {
            add(element);
        }
    }

    void remove(T element);

    void print();

    Optional<T> findByIndex(int index);

    default T getByIndex(int index) throws Exception{
        Optional<T> element = findByIndex(index);
        return element.orElseThrow(() -> new Exception("Element not found"));
    }
}
