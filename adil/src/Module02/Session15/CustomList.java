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

    T getByIndex(int index) throws Exception;
}
