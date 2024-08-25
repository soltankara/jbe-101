package session20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        evenNumbers(numbers);
        filterNumber(numbers);
        average(numbers);

        List<String> words = Arrays.asList("java", "stream", "api", "code");
        toUpper(words);
        lengthSize(words);
        joiningWords(words);
        groupedList(words);
        sortedList(words);

    }

    public static void evenNumbers(List<Integer> numbers) {
        System.out.println("even numbers: " + numbers.stream().filter(number -> number % 2 == 0).toList());
    }

    public static void toUpper(List<String> words) {
        System.out.println("to upper case: " + words.stream().map(String::toUpperCase).toList());
    }

    public static void lengthSize(List<String> words) {
        System.out.println("number of length greater than 3: " + words.stream().filter(word -> word.length() > 3).count());
    }

    public static void filterNumber(List<Integer> numbers) {
        System.out.println("first number greater than 5: " + numbers.stream().filter(number -> number > 5).findFirst());
    }

    public static void joiningWords(List<String> words) {
        System.out.println("joining words: " + words.stream().collect(Collectors.joining(", ")));
    }

    public static void groupedList(List<String> words) {
        System.out.println("grouped list: " + words.stream().collect(Collectors.groupingBy(String::length)));
    }

    public static void sortedList(List<String> words) {
        System.out.println("sorted words: " + words.stream().sorted(Comparator.comparingInt(String::length)).toList());
    }

    public static void average(List<Integer> numbers) {
        System.out.println("average number: " + numbers.stream().mapToInt(Integer::intValue).average().orElse(0));
    }
}
