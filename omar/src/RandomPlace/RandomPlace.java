package RandomPlace;

import java.util.*;

public class RandomPlace {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"));


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Collections.shuffle(numbers);

        Map<String, Integer> nameNumberMap = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            nameNumberMap.put(names.get(i), numbers.get(i));
        }

        System.out.println("Randomly matched names with numbers:");
        for (Map.Entry<String, Integer> entry : nameNumberMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Number: " + entry.getValue());
        }
    }
}
