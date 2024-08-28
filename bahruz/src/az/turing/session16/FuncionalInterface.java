package az.turing.session16;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncionalInterface {

    public static void main(String[] args) {


        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(56));

        Function<String, Integer> stringIntegerFunction = String::length;
        System.out.println(stringIntegerFunction.apply("Hello World"));

        Consumer<Integer> integerConsumer = System.out::println;
        integerConsumer.accept(45);

        Supplier<Integer> integerSupplier = () -> (int) (Math.random() * 100);
        System.out.println(integerSupplier.get());

        List<Integer> integerList = List.of(1, 2, -8, 4, 7);
        Predicate<Integer> predicate = number -> number > 0;
        Consumer<Integer> consumer = n -> System.out.print("Positive number: " + n+" ");
        integerList.stream().filter(predicate).forEach(consumer);


    }
}
