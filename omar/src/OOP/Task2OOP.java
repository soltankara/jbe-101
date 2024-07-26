package OOP;

public class Task2OOP {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex" , "Husky");
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's breed: " + dog.getBreed());
        dog.setName("Locky");
        dog.setBreed("Golden");
        System.out.println("Dog's new name: " + dog.getName());
        System.out.println("Dog's new breed: " + dog.getBreed());
    }
}
