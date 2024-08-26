package aysel.src.Session20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIHomeW {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("java", "stream", "api", "code");
        evenNumbers(numbers);
        toUpperCase(words);
        countOfWords(words);
        findGreaterThanFive(numbers);
        concatenatedString(words);
        groupedStrings(words);
        sortedStrings(words);
        averageOfElements(numbers);


    }
    public static void evenNumbers(List<Integer> numbers){
        List<Integer>  evenNumbers=numbers.stream()
                .filter(number -> number%2==0)
                .toList();
        System.out.println("Even numbers:"+ evenNumbers);
    }
    public static void toUpperCase(List<String> words){
        List<String> wordsToUpperCase=words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("To upper case: " +wordsToUpperCase);

    }
    public static void countOfWords(List<String> words){
        long count=words.stream()
                .filter(str->str.length()>3.).count();
        System.out.println("Count: "+ count);

    }
    public static void findGreaterThanFive(List<Integer> numbers){
        Optional<Integer> greaterThanFive=numbers.stream()
                .filter(n->n>5)
                .findFirst();
        System.out.println( "First element greater than 5: "+ greaterThanFive);

    }
    public static void concatenatedString(List<String> words){
        System.out.println("Concatenated Strings: "+ words.stream().collect(Collectors.joining(" ")));

    }
    public static void groupedStrings(List<String> words){
        System.out.println("Grouped by length: " + words.stream().collect(Collectors.groupingBy(String::length)));
    }
    public static void sortedStrings(List<String > words){
        System.out.println("Sorted Strings: "+words.stream().sorted(Comparator.comparingInt(String::length)).toList());

    }
    public static void averageOfElements(List<Integer> numbers){
        System.out.println("Average of elements: "+numbers.stream().mapToInt(Integer::intValue).average().orElse(0));
    }}

