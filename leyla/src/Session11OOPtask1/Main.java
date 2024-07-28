//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Leyla", 20);
        System.out.println(person.getName() + " " + "is" + " " + person.getAge());
        person.setAge(30);
        person.setName("Aysel");
        System.out.println("Now " + person.getName() + " is " + person.getAge());
    }
}
