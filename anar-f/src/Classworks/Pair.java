package Classworks;

public class Pair<T, S> {
    private final T anar;
    private final S anars;
    public Pair(T anar, S anars) {
        this.anar = anar;
        this.anars = anars;
    }
    public T getAnar() {
        return anar;
    }
    public S getAnars() {
        return anars;
    }
}
