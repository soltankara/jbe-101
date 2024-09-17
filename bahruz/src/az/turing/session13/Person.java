package az.turing.session13;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " {" + "name: " + name + " ,age: " + age + " ,weight: " + weight + '}';
    }
}
