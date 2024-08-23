package Module02.Session18.Classwork;

import java.util.*;

public class Classwork {
    public static void main(String[] args) {
    }

    private static int task1(List<Integer> list) {
        //Write a function that takes a List<Integer> and returns the element that
        //appears most frequently.
        Map<Integer, Integer> map = new HashMap<>();
        int max = list.getFirst();
        for (Integer i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > map.get(max)) {
                max = i;
            }
        }
        return max;
    }

    private static List<Integer> task2(List<Integer> list1, List<Integer> list2) {
        //Given two List<Integer>s, find their intersection (elements common to
        //both lists).
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

    private static List<Integer> task3(List<Integer> list) {
        //Write a function that returns all the duplicate elements in a List<Integer>.
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
