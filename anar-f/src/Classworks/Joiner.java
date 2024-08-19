package Classworks;

import java.util.List;

@FunctionalInterface
public interface Joiner <T>{
    List<T> join(T... elements);
}
