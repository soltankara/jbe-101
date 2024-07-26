package OOPquestions.problem1;

public class MainPart {
    public static void main(String[] args) {
        Person person1 = new Person("Aydin", 15);
        Person person2 = new Person("Kamil", 19);
        System.out.println(person1.getName() + "'s age is " + person1.getAge());
        System.out.println(person2.getName() + "'s age is " + person2.getAge());

    }
}
