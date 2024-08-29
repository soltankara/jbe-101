package Session20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1, 2, 6, 7, 3, 8);
        Optional<Integer> greaterElement = elements.stream()
                .filter(n -> n > 5)
                .findFirst();
        System.out.println("first element greater than five is : " + greaterElement);
    }
}
