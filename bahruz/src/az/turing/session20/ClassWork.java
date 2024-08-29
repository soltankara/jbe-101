package az.turing.session20;

import java.util.*;
import java.util.stream.Collectors;

public class ClassWork {

    public static void main(String[] args) {

        //Task1
        List<Integer> integerList = Arrays.asList(1, 2, 4, 7, 6, 8, 3);
        integerList.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

        //Task2
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().map(String::toUpperCase).forEach(System.out::println);


        //Task3
        List<String> words = Arrays.asList("java", "stream", "api", "code");
        words.stream().filter(w -> w.length() > 3).forEach(System.out::println);

        //Task4
        List<Integer> numbers = Arrays.asList(1, 2, 5, 6, 3, 8);
        Optional<Integer> a = numbers.stream().filter(n -> n > 5).findFirst();
        a.ifPresent(c -> System.out.println(c));

        //Task5
        List<String> words1 = Arrays.asList("java", "stream", "api");
        Optional<String> result = words1.stream().reduce((s, s2) -> s.concat(s2));
        result.ifPresent(System.out::println);
        System.out.println("------------");

        //Task6
        List<String> words2 = Arrays.asList("java", "code", "stream", "api", "lambda");
        List<Integer> length = words2.stream().map(w -> w.length()).collect(Collectors.toList());
        System.out.println(length);

        //Task7
        List<String> words4 = Arrays.asList("java", "code", "stream", "api", "lambda");
        List<String> resultLengthSort = words4.stream().
                sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(resultLengthSort);


        //Task8
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        Double avarage = numbers1.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("=--------------------------");

        Map<Integer ,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(1,"C");
        map.put(null,"D");
        map.put(null,"E");
        System.out.println(map);
        System.out.println(map.keySet());


    }
}

