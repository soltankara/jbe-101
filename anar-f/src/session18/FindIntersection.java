package session18;

import java.util.*;

public class FindIntersection {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(1, 14, 4, 2, 0, 13, 12, 11, 1, 8);
        System.out.println(duplicateElements(list1, list2));
    }

    public static List<Integer> duplicateElements(List<Integer> list1, List<Integer> list2) {
        Map<Integer, Boolean> map = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        for (Integer i : list1) {
            map.put(i, true);
        }
        for (Integer i : list2) {
            if (map.get(i) != null) result.add(i);
        }
        return result.stream().toList();
    }
}
