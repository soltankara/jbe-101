package turqut.src.w3oop;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Reks", "Alaskan Malamute");
        Dog dog2 = new Dog("Enes", "Australian Terrier");

        dog1.printDetails();
        dog2.printDetails();

        dog1.setName("Toplan");
        dog1.setBreed("Afghan Hound");
        dog2.setName("Buddy");
        dog2.setBreed("Beagle");

        System.out.println("Updated details : ");

        dog1.printDetails();
        dog2.printDetails();

    }
}
