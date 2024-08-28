package az.turing.oop.coursework;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Joiner<Integer> joiner = Arrays::asList;

        System.out.println(joiner.join(1, 2, 3, 4, 5));

        Runnable task = () -> System.out.println("run run run");
        task.run();

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(5));

        Function<String, Integer> stringIntegerFunction = number -> number.length();
        System.out.println(stringIntegerFunction.apply("Hello World"));

        Consumer<String> stringConsumer = str -> System.out.println(str);

        stringConsumer.accept("Java is independed");

        Supplier<Integer> randomSupplier = () -> new Random().nextInt();

        System.out.println(randomSupplier.get());


    }
}
