package OOPquestions.problem2;

/*Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class,
set their attributes using the constructor and modify the attributes using the setter methods and print
the updated values.*/
public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
