package session20;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
//      1.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var list1 = numbers
                .stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println(list1);

//      2.
        List<String> words = Arrays.asList("java", "stream", "exercise");
        var list2 = words
                .stream()
                .map(s -> s.toUpperCase())
                .toList();
        System.out.println(list2);

//      3.
        List<String> words1 = Arrays.asList("java", "stream", "api", "code");
        var list3 = words1
                .stream()
                .filter(s -> s.length() > 3)
                .count();
        System.out.println(list3);

//      4.
        List<Integer> numbers1 = Arrays.asList(1, 2, 6, 7, 3, 8);
        var list4 = numbers1
                .stream()
                .filter(s -> s > 5)
                .findFirst();
        System.out.println(list4.get());

//      5.
        List<String> words2 = Arrays.asList("java", "stream", "api", "lambda");
        var list5 = words2
                .stream()
                .map(Objects::toString)
                .toList();
        System.out.println(list5);

//      6.
        List<String> words3 = Arrays.asList("java", "code", "stream", "api", "lambda");
        var list6 = words3
                .stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(list6);

//      7.
        List<String> words4 = Arrays.asList("java", "code", "stream", "api", "lambda");
        var list7 = words4
                .stream()
                .sorted()
                .toList();
        System.out.println(list7);

//      8.
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        var list8 = numbers2
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(list8);
    }
}
