package session17;


import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = t;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        return String.valueOf(sb);
    }

}
