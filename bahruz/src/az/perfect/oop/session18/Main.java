package az.perfect.oop.session18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(4);
        integerList.add(4);
        integerList.add(1);

        System.out.println(integerList);
        System.out.println(findMostFrequentElement(integerList));


    }

    public static Integer findMostFrequentElement(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
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
}


