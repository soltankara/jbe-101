package Session20;
import java.util.Arrays;
import java.util.List;

public class StringCounter {
    public static void main(String[] args) {
        List<String> givenWords = Arrays.asList("Java", "sTream", "api", "code", "Kenan");
        long count = givenWords.stream()
                .filter(perWord -> perWord.length() > 3)
                .count();
        System.out.println("String Count is : " + count);
    }
}

