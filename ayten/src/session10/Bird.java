package session10;

public class Bird extends  Animal implements Flyable {

    @Override
    public void fly() {
        System.out.printf("%s",getName());
    }
}
