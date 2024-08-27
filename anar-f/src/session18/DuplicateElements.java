package session18;

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(findIntersection(list));
    }

    public static List<Integer> findIntersection(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        for (Integer i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > 1) {
                result.add(i);
            }
        }
        return result.stream().toList();

    }
}
