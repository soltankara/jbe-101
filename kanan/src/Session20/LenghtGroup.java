package Session20;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LenghtGroup {
    public static void main(String[] args) {
        List<String> givenWords = Arrays.asList("java", "code", "stream", "api", "lambda");
        Map<Integer, List<String>> Grouoped = givenWords.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped Strings : " + Grouoped);
    }
}
