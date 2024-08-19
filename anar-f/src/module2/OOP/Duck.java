package module2.OOP;

public class Duck extends Animal implements Swimmable, Flyable, Runable {
    @Override
    public void fly() {
        System.out.println(getName() + " flies");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims");
    }

    @Override
    public void run() {
        System.out.println(getName() + " runs");
    }
}
