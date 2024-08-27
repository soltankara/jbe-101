package aysel.src.Session17;

import java.util.Arrays;

public class LeetCodeHW {
    // 1.Two Sum(Easy)
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    // 2.Roman to integer (Easy)
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = valueOfRoman(s.charAt(i));


            if (currentValue > prevValue) {
                result += currentValue - 2 * prevValue;
            } else {

                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
    private int valueOfRoman(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    //3.Remove duplicates from sorted array(Easy)
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    //4.Search insert position(Easy)
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
    //5.Merge sorted array(Easy)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
    //6.Reversed integer(Medium)
    public int reverse(int x) {
        long reversed = 0;
        int original = x;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            reversed = reversed * 10 + digit;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }


        return (int) reversed;

    }
    //7.Integer to Roman(Medium)
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();


        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }
    //8.pow(x,n)(Medium)
    public double myPow(double x, int n) {
        double result = 1.0;

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        return result;
    }
    //9.Median of two sorted array(Hard)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }
        Arrays.sort(merged);

        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2];
        } else {
            return (merged[n / 2 - 1] + merged[n / 2])/2.0 ;
        }
    }


}





