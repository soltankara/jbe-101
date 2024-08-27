package Session20_Stream;
import java.util.*;
import java.util.stream.Collectors;
public class StreamPractise {
    public static void main(String[] args) {

        //1. Filter out the even numbers and collect them into a new list
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers1.stream()
                .filter(n -> n % 2 == 0.)
                .toList();
        System.out.println(evenNumbers);
        //----------------------------------------------------------------------------------------------
        //2. Convert each string to uppercase and collect the result into a new list
        List<String> words1 = Arrays.asList("java", "stream", "exercise");
        List<String> upperCaseWords = words1.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCaseWords);
        //----------------------------------------------------------------------------------------------
        //3. Count strings with Lengh greater than 3
        List<String> words2 = Arrays.asList("java", "stream", "api", "code");
        long count = words2.stream()
                .filter(word -> word.length() > 3)
                .count();
        System.out.println(count);
        //----------------------------------------------------------------------------------------------
        //4. Find the first element that is greater than 5
        List<Integer> numbers2 = Arrays.asList(1, 2, 6, 7, 3, 8);
        Optional<Integer> firstNumberGreaterThanFive = numbers2.stream()
                .filter(number -> number > 5)
                .findFirst();
        System.out.println(firstNumberGreaterThanFive.orElse(null));
        //----------------------------------------------------------------------------------------------
        //5. Concatenate Strings
        List<String> words3 = Arrays.asList("java", "stream", "api");
        String concatenated = words3.stream()
                .collect(Collectors.joining(", "));
        System.out.println(concatenated);
        //----------------------------------------------------------------------------------------------
        //6. Group strings by their length
        List<String> words4 = Arrays.asList("java", "code", "stream", "api", "lambda");
        Map<Integer, List<String>> groupByLength = words4.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);
        //----------------------------------------------------------------------------------------------
        //7. Sort strings by their length
        List<String> words5 = Arrays.asList("java", "code", "stream", "api", "lambda");
        List<String> sortByLengths = words5.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(sortByLengths);
        //----------------------------------------------------------------------------------------------
        //8. Calculate the average
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers3.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(average);
    }
}
