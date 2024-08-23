package Module02.Session18.Homework.leetcode;

import java.util.Arrays;

public class TwoPointers {

    public void sortColors(int[] nums) {
        //https://leetcode.com/problems/sort-colors/description/
        int k = 0;
        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[k++] = i;
            }
        }
    }

    public int removeDuplicates(int[] nums) {
        //https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i - 2] || nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
                if (nums[i] != nums[i - 2]) {
                    nums[i]--;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //https://leetcode.com/problems/merge-sorted-array/submissions/1364386991/
        int k = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //https://leetcode.com/problems/subarray-product-less-than-k/description/
        int count = 0;
        boolean flag = true;
        for (int num : nums) {
            if (num < k) {
                count++;
            }
            if (num != 1) flag = false;
        }
        if (flag && k > 1) return f(nums.length);
        for (int i = 2; i <= nums.length; i++) {
            int temp = sliding(nums, k, i);
            if (temp == 0) return count;
            count += temp;
        }
        return count;
    }

    private int f(int n) {
        if (n == 0)
            return 0;
        else
            return (n + f(n - 1));
    }

    private int sliding(int[] nums, int k, int n) {
        int count = 0;
        int i = 0, j = n;
        long product = 1;
        while (i < j) {
            product *= nums[i];
            i++;
        }
        i = 0;
        if (product < k) count++;
        while (j < nums.length) {
            product *= nums[j++];
            product /= nums[i++];
            if (product < k) count++;
        }
        return count;
    }
}
