package Session7Arrays;

import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        int[] nums = {4, 6, 5, 5, 4, 6, 4, 6, 2, 8};
        Arrays.sort(nums);
        System.out.print("Max value is ");
        System.out.println(nums[nums.length - 1]);
        System.out.print("Min value is ");
        System.out.println(nums[0]);

    }
}
