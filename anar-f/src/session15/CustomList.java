package session15;

import java.util.Optional;

public interface CustomList<T> {
    void add(T element);

    void addAll(T... elements);

    void remove(T element);

    void print();

    Optional<T> findByIndex(int index);

    T getByIndex(int index) throws Exception;
}
