package Classworks;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(findEvenNumbers(list));

        List<String> words = Arrays.asList("java", "stream", "exercise");
        System.out.println(toUppercase(words));

        List<String> words1 = Arrays.asList("java", "stream", "api", "code");
        System.out.println(greaterThanThree(words1));

        List<Integer> numbers = Arrays.asList(1, 2, 6, 7, 3, 8);
        System.out.println(findFirstGreaterThanFive(numbers));

        List<String> words2 = Arrays.asList("java", "stream", "api");
        System.out.println(concatStrings(words2));

        List<String> words3 = Arrays.asList("java", "code", "stream", "api", "lambda");
        System.out.println(groupStringsByLength(words3));

        List<String> words4 = Arrays.asList("java", "code", "stream", "api", "lambda");
        System.out.println(sortStringsByLength(words4));

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(calculateAverage(numbers1));
    }

    public static List<Integer> findEvenNumbers(List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).toList();
    }

    public static List<String> toUppercase(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

    public static Integer greaterThanThree(List<String> list) {
        return Math.toIntExact(list.stream().filter(word -> word.length() > 3).count());
    }

    public static Optional<Integer> findFirstGreaterThanFive(List<Integer> list) {
        return list.stream().filter(n -> n > 5).findFirst();
    }

    public static String concatStrings(List<String> list) {
        return list.stream().collect(Collectors.joining());
    }

    public static Map<Integer, List<String>> groupStringsByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length));
    }

    public static List<String> sortStringsByLength(List<String> list) {
        return list.stream().sorted((s1, s2) -> Integer.compare(s1.length() , s2.length()))
                .collect(Collectors.toList());
    }

    public static OptionalDouble calculateAverage(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).average();
    }
}
