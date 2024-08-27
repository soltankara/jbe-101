package stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(getEvenNumbers(numbers));

        List<String> words = Arrays.asList("java", "stream", "exercise");
        System.out.println(getToUppercase(words));
        System.out.println(getCountLengthThanThree(words));
        System.out.println(getTheGreaterThanFive(numbers));
        System.out.println(getConcatted(words));
        System.out.println(groupForLength(words));
        System.out.println(getAverage(numbers));
    }

    public static List<Integer> getEvenNumbers(List<Integer> nums) {
        return nums.stream().filter(n -> n % 2 == 0).toList();
    }

    public static List<String> getToUppercase(List<String> str) {
        return str.stream().map(String::toUpperCase).toList();
    }

    public static Long getCountLengthThanThree(List<String> str) {
        return str.stream().filter(s -> s.length() > 3).count();
    }

    public static Optional<Integer> getTheGreaterThanFive(List<Integer> nums) {
        return nums.stream().filter(a -> a > 5).findFirst();
    }

    public static String getConcatted(List<String> str) {
        return String.join(", ", str);
    }

    public static Map<Integer, List<String>> groupForLength(List<String> list) {
        return list.stream().collect(groupingBy(String::length));
    }

    public static List<String> getSortedByLength(List<String> list) {
        return list.stream().sorted(Comparator.comparingInt(String::length)).toList();
    }

    public static double getAverage(List<Integer> list) {
        return list.stream().collect(Collectors.averagingInt(Integer::intValue));
    }
}
