package az.turing.session7.homework1;

public class Box<E> {

    E data;

    public Box(E data) {
        this.data = data;
    }

    public E getdata() {
        return data;
    }
}
