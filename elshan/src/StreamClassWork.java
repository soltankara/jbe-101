import java.util.*;
import java.util.stream.Collectors;

public class StreamClassWork {
    public static void main(String[] args) {

        // 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result1 = numbers.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result1);

        // 2
        List<String> words = Arrays.asList("java", "stream", "exercises");
        List<String> result2 = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result2);

        // 3
        List<String> words2 = Arrays.asList("java", "stream", "api", "code");
        long result3 = words2.stream()
                .filter(s -> s.length() > 3)
                .count();
        System.out.println(result3);

        // 4
        List<Integer> numbers2 = Arrays.asList(1, 2, 6, 7, 3, 8);
        Optional<Integer> result4 = numbers2.stream()
                .filter(s -> s > 5)
                .findFirst();
        System.out.println(result4.get());

        // 5
        List<String> words3 = Arrays.asList("java", "stream", "api", "lampda");
        String result5 = words3.stream()
                .collect(Collectors.joining());
        System.out.println(result5);

        // 6
        List<String> words4 = Arrays.asList("java", "code", "stream", "api", "lampda");
        Map<Integer,List<String>> result6 = words4.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(result6);

        // 7
        List<String> result7 = words4.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(result7);

        // 8
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers3.stream()
                .collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println(average);
    }

}

