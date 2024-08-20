package session10;

public class Duck extends Animal implements Flyable,Swimable {


    @Override
    public void fly() {
        System.out.printf("%s is flying",getName());
        System.out.println();
    }

    @Override
    public void swim() {
        System.out.printf("%s is swimming",getName());
    }
}
