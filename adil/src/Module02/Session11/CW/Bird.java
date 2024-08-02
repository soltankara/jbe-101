package Module02.Session11.CW;

public class Bird extends Animal implements Fly{
    @Override
    public void fly() {
        System.out.printf("%s is flying", getName());
    }
}
