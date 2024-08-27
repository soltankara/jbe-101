package Session20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTasks {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println("Final Result:");
        result.forEach(System.out::println);
        //2
        List<String> words = Arrays.asList("java", "stream", "exercise");
        List<String> result2 = words.stream().map(String::toUpperCase).toList();
        System.out.println("Final Result2:");
        result2.forEach(System.out::println);
        //3
        List<String> words1 = Arrays.asList("java", "stream", "api", "code");
        long count = words1.stream().filter(String -> String.length() > 3).count();
        System.out.println(count);
        //4
        List<Integer> numbers1 = Arrays.asList(1, 2, 6, 7, 3, 8);
        Optional<Integer> result4 = numbers1.stream().filter(n -> n > 5).findFirst();
        System.out.println(result4);
        //5
        List<String> words2 = Arrays.asList("java", "stream", "api");
        String result5 = words2.stream().collect(Collectors.joining());
        System.out.println(result5);
        //6
        List<String> words6 = Arrays.asList("java", "code", "stream", "api", "lambda");
        String result6 = words6.stream().collect(Collectors.groupingBy(String::length)).toString();
        System.out.println(result6);
        //7
        List<String> words7 = Arrays.asList("java", "code", "stream", "api", "lambda");
        Stream<String> result7 = words7.stream().sorted(Comparator.comparing(String::length));
        result7.forEach(System.out::println);
        //8
        List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5);
        Integer result8 = numbers8.stream().reduce(0, Integer::sum);
        System.out.println(result8);


    }
}
