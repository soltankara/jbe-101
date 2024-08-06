package OOPquestions.problem2;

public class MainPart {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Leo", "husky");
        Dog dog2 = new Dog("Lola", "pitbull");

        System.out.println(dog1.getName() + "'s breed is " + dog1.getBreed());
        System.out.println(dog2.getName() + "'s breed is " + dog2.getBreed());

        System.out.println("\nNew ones are the below: \n");

        dog1.setName("Archie");
        dog1.setBreed("labrador");
        dog2.setName("Chelly");
        dog2.setBreed("golden retriver");

        System.out.println(dog1.getName() + "'s breed is " + dog1.getBreed());
        System.out.println(dog2.getName() + "'s breed is " + dog2.getBreed());
    }
}
