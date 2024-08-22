package az.perfect.oop.session13;

public class Box {
    private String name;
    private String surname;

    public Box(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Box() {
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
