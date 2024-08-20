package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionClassWork {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(5);

        //Task1
        System.out.println(list);
        System.out.println(frequentlyElement(list));

        //Task2
        List<Integer> listA = List.of(1, 2, 3, 4, 5);
        List<Integer> listB = List.of(3, 4, 5, 6, 7);
        System.out.println(intersection(listA, listB));

        //Task3
        System.out.println(extractDuplicateElements(list));

    }

    public static Integer frequentlyElement(List<Integer> list) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        Integer mostFrequent = null;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }

    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : listA) {
            map.put(num, Boolean.TRUE);
        }

        List<Integer> integers = new ArrayList<>();
        for (Integer i : listB) {
            if (map.getOrDefault(i, false)) {
                integers.add(i);
            }
        }
        return integers;
    }

    public static List<Integer> extractDuplicateElements(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicateElements = new ArrayList<>();

        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateElements.add(entry.getKey());
            }
        }
        return duplicateElements;
    }
}


