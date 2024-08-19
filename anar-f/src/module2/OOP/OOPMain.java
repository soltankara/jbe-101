package module2.OOP;

public class OOPMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal = new Duck();
        animal.setName("anar");
        updateValue(animal);
    }
    private static void updateValue(Animal animal) {
        if (animal instanceof Duck) {
            Duck duck = (Duck) animal;
            duck.fly();
            duck.run();
        }
        else if (animal instanceof Bird){
            Bird bird = (Bird) animal;
            bird.fly();
        }
    }
}
