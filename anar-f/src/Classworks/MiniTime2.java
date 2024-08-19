package Classworks;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MiniTime2 {
    public static void main(String[] args) {
        List<Integer> ability = List.of(3, 5, 1);
        System.out.println(minimumTime(ability, 8));
    }
    public static int minimumTime(List<Integer> ability, long processes){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(ability);
        int minimumTime = 0;
        while (processes > 0) {
            int maxAbility = maxHeap.poll();
            processes -= maxAbility;
            minimumTime++;
            maxHeap.offer(maxAbility / 2);
        }
        return minimumTime;
    }
}
