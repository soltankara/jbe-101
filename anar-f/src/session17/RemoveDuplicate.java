package session17;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
