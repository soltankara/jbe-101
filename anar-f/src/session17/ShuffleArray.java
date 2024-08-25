package session17;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr, 4)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int [] shuffled = new int[2*n];
        for (int i = 0; i < n; i++) {
            shuffled[2*i] = nums[i];
            shuffled[2*i + 1] = nums[i+n];
        }
        return shuffled;
    }
}
