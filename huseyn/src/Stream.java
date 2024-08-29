package huseyn.src;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("java", "stream", "exercise");
        List<String> words2 = Arrays.asList("java", "stream", "api", "code");
        List<Integer> numbers2 = Arrays.asList(1, 2, 6, 7, 3, 8);
        List<String> words3 = Arrays.asList("java", "stream", "api");
        List<String> words4 = Arrays.asList("java", "code", "stream", "api", "lambda");
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);

        //1. Filter out the even numbers and collect them into a new list
        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0).toList();
        System.out.println(even);

        //2. Convert each string to uppercase and collect the result into a new list
        List<String> upper = words.stream()
                .map(String::toUpperCase).toList();
        System.out.println(upper);

        //3. Count strings with Length greater than 3

        //4. Find the first element that is greater than 5
        Optional<Integer> greater = numbers2.stream()
                .filter(i -> i > 5)
                .findFirst();

        //5. Concatenate Strings
        String concatenatedString = words3.stream()
                .collect(Collectors.joining());
        System.out.println(concatenatedString);

       //7. Sort strings by their length
        List<String> sortedByLength = words4.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedByLength);

        //8. Calculate the average
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);

    }
}
