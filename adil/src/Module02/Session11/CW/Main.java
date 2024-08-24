package Module02.Session11.CW;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setName("Duccy");
        duck.fly();
        duck.swim();
        Dog dog = new Dog();
        dog.setName("Dog");
        dog.run();
        Bird bird = new Bird();
        bird.setName("Bird");
        bird.fly();
    }
}
