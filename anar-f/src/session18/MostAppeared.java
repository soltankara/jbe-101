package session18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostAppeared {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(2);
        System.out.println(mostAppeared(list));
    }

    public static Integer mostAppeared(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int mostAppeared = 0;
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            var key = entrySet.getKey();
            var value = entrySet.getValue();
            if (mostAppeared < value) {
                mostAppeared = key;
            }
        }
        return mostAppeared;
   }
}
