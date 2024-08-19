package Classworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTime {
    public static void main(String[] args) {
        List<Integer> ability = new ArrayList<>();
        ability.add(3);
        ability.add(5);
        ability.add(1);
        System.out.println(minimumTime(ability, 8));
    }

    public static int minimumTime(List<Integer> ability, long processes) {
        // Write your code here
        int minimumTime = 0;
        Collections.sort(ability, Collections.reverseOrder());
        while (processes > 0) {
            int maxAbility = ability.get(0);
            processes -= maxAbility;
            minimumTime++;
            ability.set(0, maxAbility/2);
            Collections.sort(ability, Collections.reverseOrder());
        }
        return minimumTime;
    }
}

