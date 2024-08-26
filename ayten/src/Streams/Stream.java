package Streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 5, 10, 4, 8);
        System.out.println(findingEven(nums));
        List<String> elements = List.of("java", "coding", "stream", "api");
        // System.out.println(concatenate(elements));
        Map<Integer, List<String>> group = collectingByLength(elements);
        for (Map.Entry<Integer, List<String>> entry : group.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println(sortingByName(elements));
        System.out.println(findingAverage(nums));

    }

    public static List<Integer> findingEven(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }

    public static List<String> makingUpper(List<String> elements) {
        return elements.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public static long findingCountLength(List<String> elem) {
        return elem.stream()
                .filter(word -> word.length() > 4)
                .count();
    }

    public static int findingGreaterThanFive(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n > 5)
                .findFirst()
                .orElse(-1);
    }

    public static String concatenate(List<String> elements) {
        return elements.stream()
                .collect(Collectors.joining(","));
    }

    public static Map<Integer, List<String>> collectingByLength(List<String> elements) {
        return elements.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public static List<String> sortingByName(List<String> elements) {
        return elements.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
    }

    public static double findingAverage(List<Integer> nums) {
        return nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

}
