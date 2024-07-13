package Session7Arrays;

import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        int[] nums = {5, 4, 6, 7, 3, 4, 6, 3, 7, 8, 9};
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        System.out.println(Arrays.toString(nums2));

    }
}
