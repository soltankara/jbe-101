package Module02.Session18.Homework.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointers {
    public String fractionAddition(String expression) {

        //https://leetcode.com/problems/fraction-addition-and-subtraction/description/?envType=daily-question&envId=2024-08-23

        List<Integer> denominators = new ArrayList<>();
        for (int i = 2; i < expression.length(); i++) {
            StringBuilder denoStr = new StringBuilder();
            if (expression.charAt(i - 1) == '/') {
                while (!(expression.charAt(i) == '-' || expression.charAt(i) == '+')) {
                    denoStr.append(expression.charAt(i++));
                    if (i == expression.length()) break;
                }
                denominators.add(Integer.parseInt(denoStr.toString()));
            }
        }
        int denominator;
        denominator = denominators.getFirst();
        for (int i = 1; i < denominators.size(); i++) {
            denominator = LCM(denominator, denominators.get(i));
        }
        if (expression.charAt(0) != '-') expression = '+' + expression;
        int sum = 0;
        for (int i = 0; i < expression.length() - 2; i++) {
            if (expression.charAt(i) == '-' || expression.charAt(i) == '+') {
                StringBuilder numStr = new StringBuilder();
                while (expression.charAt(i) != '/') {
                    numStr.append(expression.charAt(i++));
                }
                i++;
                StringBuilder denoStr = new StringBuilder();
                while (!(expression.charAt(i) == '-' || expression.charAt(i) == '+')) {
                    denoStr.append(expression.charAt(i++));
                    if (i == expression.length()) break;
                }
                i--;
                int num = Integer.parseInt(numStr.toString());
                int deno = Integer.parseInt(denoStr.toString());
                num = num * denominator / deno;
                sum += num;
            }
        }
        if (sum == 0) {
            return "0/1";
        }
        int gcd = GCD(sum, denominator);
        if (gcd < 0) gcd = -gcd;
        return sum / gcd + "/" + denominator / gcd;
    }

    private int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    private int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }

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
