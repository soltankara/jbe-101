package az.turing.session18;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Task1
        List<Integer> numbers = List.of(1, 3, 2, 3, 4, 1, 3, 2, 2, 2);
        System.out.println("Most frequent element: " + findMostFrequentElement(numbers));


        //Task2
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8, 9);

        List<Integer> intersection = findIntersection(list1, list2);
        System.out.println("Intersection: " + intersection);

        //Task3
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 2, 5, 3, 6, 7, 8, 3);
        List<Integer> duplicates = findDuplicates(numbers1);
        System.out.println("Duplicate elements: " + duplicates);
    }

    //Task1
    public static Integer findMostFrequentElement(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        Integer mostFrequentElement = null;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }
        return mostFrequentElement;
    }


    //Task2
    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> intersection = new HashSet<>();
        for (Integer num : list2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        return new ArrayList<>(intersection);
    }

    //Task3
    public static List<Integer> findDuplicates(List<Integer> list) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

}


    /*
    //        LinkedList<String> s = new LinkedList<>();
//        s.add("Josep Murphy");
//        s.add("James Clear");
//        s.add("Napollion Hill");
//        s.add("Mehmet Kirazli");
//        LinkedList<String> ss = (LinkedList<String>) s.clone();
//        s.add("Lionel Andres Messi");
//        s.set(1, "Atommic Habbits");
//        ss.forEach(System.out::println);
//        System.out.println("--------------");
//        s.forEach(System.out::println);
//        System.out.println("--------------");
//        s.removeIf(s1 -> s1.startsWith("J"));
//        s.forEach(System.out::println);

        Map<Integer, String> sd = new HashMap<>();
        sd.put(1, "Manqo");
        sd.put(23, "Avacado");
        sd.put(25, "Orange");
        sd.put(24, "Apple");
        sd.put(29, "Banane");
        String rs = sd.get(1);
        System.out.println(rs);
        Set<Integer> set = sd.keySet();
        set.forEach(System.out::println);
        System.out.println(sd.containsKey(1));
        System.out.println(sd.containsValue("40"));
        //sd.remove(1);
        System.out.println(sd.containsKey(1));
        System.out.println(sd.size());
        Collection<String> lsid = sd.values();
        System.out.println(lsid);
        Set<Map.Entry<Integer, String>> entries = sd.entrySet();
        System.out.println(entries);

     */
