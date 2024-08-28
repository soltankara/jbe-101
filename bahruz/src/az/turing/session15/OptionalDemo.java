package az.turing.session15;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        //Task3
        Optional<String> stringOptional = Optional.of("Hello World");
        stringOptional.ifPresent(System.out::println);
        boolean n = stringOptional.isPresent();
        System.out.println(n);

        Optional<String> emptyOptional = Optional.empty();
        String result = emptyOptional.orElse("Default Optional");
        System.out.println("Result: " + result);

        Optional<Integer> optionalInteger = Optional.ofNullable(45);
        if (optionalInteger.isPresent()) {
            System.out.println(optionalInteger.get());
        } else {
            System.out.println("OptionalInteger is empty");
        }
        Optional<Integer> optionalInteger1 = Optional.ofNullable(null);



    }
}
