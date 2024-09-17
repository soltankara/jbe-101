package az.turing.session13;


import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<Person>optionalPerson=Optional.of(new Person("Sanan",22,80));
        System.out.println(optionalPerson.isPresent());
        System.out.println(optionalPerson.get());


    }


}
