package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class ClassWork {
    public static void main(String[] args) {
        //Task1 - Filter out the even numbers and collect them into a new list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        //Task 2 - Convert each string to uppercase and collect the result into a new list
        List<String> words = Arrays.asList("java", "stream", "exercise");
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(uppercaseWords);

        //Task 3 - Count strings with length greater than 3
        List<String> words2 = Arrays.asList("java", "stream", "api", "code");
        long countLongWords = words2.stream()
                .filter(word -> word.length() > 3)
                .count();
        System.out.println("Number of words with length greater than 3: " + countLongWords);

        //Task 4 - Find the first element that is greater than 5
        List<Integer> numbers2 = Arrays.asList(1, 2, 6, 7, 3, 8);
        Integer firstGreaterThanFive = numbers2.stream()
                .filter(num -> num > 5)
                .findFirst()
                .orElse(null);
        System.out.println("First number greater than 5: " + firstGreaterThanFive);

        //Task 5 - Concatenate Strings
        List<String> words3 = Arrays.asList("java", "stream", "api");
        String concatenatedWords = words.stream()
                .reduce("", (concat, word) -> concat + word + "");
        System.out.println("Concatenated words: " + concatenatedWords);

        //Task 6 - Group strings by their length
        List<String> words4 = Arrays.asList("java", "code", "stream", "api", "lambda");
        Map<Integer, List<String>> groupedWords = words4.stream()
                .collect(groupingBy(String::length));
        System.out.println("Grouped words by length: " + groupedWords);

        //Task 7 - Sort strings by their length
        List<String> sortedWords = words4.stream()
                .sorted((word1, word2) -> word1.length() - word2.length())
                .toList();
        System.out.println("Sorted words by length: " + sortedWords);

        //Task 8 - Calculate the average
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers3.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Average of numbers: " + average);

    }
}
