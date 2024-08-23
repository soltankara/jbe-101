package Module02.Session18.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringList) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : queries) {
            result.add(map.getOrDefault(s, 0));
        }
        return result;
    }
}
