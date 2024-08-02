package OOP;

public class Bird extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println(getName() + " runs");
    }
}
