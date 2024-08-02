package Module02.Session11.CW;

public class Duck extends Animal implements Swimable, Fly{

    @Override
    public void fly() {
        System.out.printf("%s is flying.\n", getName());
    }

    @Override
    public void swim() {
        System.out.printf("%s is swimming\n", getName());
    }
}
