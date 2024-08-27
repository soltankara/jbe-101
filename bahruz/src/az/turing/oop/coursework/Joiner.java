package az.turing.oop.coursework;

import java.util.List;

@FunctionalInterface
public interface Joiner<T> {
    List<T> join(T ... a);
}
