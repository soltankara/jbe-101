public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Turqut", 20);
        Person person2 = new Person("Sebuhi", 23);


        System.out.printf(String.format("%s is %d years old", person1.getName(), person1.getAge()));
        System.out.println();
        System.out.printf(String.format("%s is %d years old", person2.getName(), person2.getAge()));

    }
}
