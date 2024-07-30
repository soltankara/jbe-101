package session11;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("anar", "golden");
        Dog dog2 = new Dog("cosqun", "chihuahua");
        dog1.setName("kamil");
        dog2.setName("adil");
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
