//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog1=new Dog("Toppus","Golden Retriever");
        Dog dog2=new Dog("Lucy","Akita");
        System.out.println(dog1.getName()+" is a " + dog1.getBreed());
        System.out.println(dog2.getName()+" is a " + dog2.getBreed());
        dog1.setName("Lucy");
        dog1.setBreed("Akita");
        dog2.setName("Toppus");
        dog2.setBreed("Golden Retriever");
        System.out.println(dog1.getName()+" is now " + dog2.getBreed());
        System.out.println(dog2.getName()+" is now " + dog1.getBreed());

    }
}