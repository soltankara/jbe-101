package az.perfect.oop.session13;

import java.lang.reflect.Array;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

//        Function<Integer, String> intToString = num -> "Number:" + num;
//
//        System.out.println(intToString.apply(15));   // Çıxış: Say: 15

        Predicate<String> stringPredicate = nusm -> nusm.length() > 1;
        System.out.println(stringPredicate.test("nusm"));

        Consumer<Integer> integerConsumer = str -> System.out.println(str);
        integerConsumer.accept(500);

        Supplier<Integer> stringSupplier = () ->new Random().nextInt(1000);
        System.out.println(stringSupplier.get());


    }

}
