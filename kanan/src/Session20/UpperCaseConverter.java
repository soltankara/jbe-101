package Session20;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class UpperCaseConverter {
    public static void main(String[] args) {

        List<String> inputWords = Arrays.asList("java", "Kenan", "stream", "exercise");

        List<String> upperCaseWords = inputWords.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("UpperCasedWords : " + upperCaseWords);
    }
}