package session8;

import java.util.Arrays;

public class LeetCode2 {
    public static void main(String[] args) {
        //1.Two sum
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        //4. Median of two sorted arrays
        int[] arr1 = new int[]{1, 3};
        int[] arr2 = new int[]{2};
        System.out.println(findMedianSortedArrays(arr1, arr2));
        //26. Remove duplicates from sorted array
        int[] nums1 = {1, 1, 2};
        System.out.println(removeDuplicates(nums1));
        //27. Remove Element
        int[] nums2 = {3, 2, 2, 3};
        int val = 2;
        System.out.println(removeElement(nums2, val));
        //35. Search Insert Position
        int[] arr = {1, 2, 3, 4, 5};
        int target1 = 5;
        System.out.println(searchInsert(arr, target1));
        //88. Merge Sorted Array
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int m = 3, n = 3;
        int[] num2 = {2, 5, 6};
        merge(num1, m, num2, n);
        //136. Single Number
        int[] number = {1, 2, 2};
        System.out.println(singleNumber(number));
        //217. Contains Duplicate
        int[] numbers = {1, 2, 3, 1};
        System.out.println(containsDuplicate(numbers));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int i1 = i + 1; i1 < nums.length; ++i1) {
                if (nums[i] + nums[i1] == target) {
                    arr[0] = i;
                    arr[1] = i1;
                }
            }
        }
        return arr;
    }

    static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int k = arr1.length + arr2.length;
        int[] arr3 = new int[k];
        int i = 0;
        for (int i2 = 0; i2 < arr1.length; ++i2) {
            arr3[i++] = arr1[i2];
        }
        for (int i2 = 0; i2 < arr2.length; ++i2) {
            arr3[i++] = arr2[i2];
        }
        Arrays.sort(arr3);
        return k % 2 == 1 ? (double) arr3[k / 2] : (double) (arr3[k / 2] + arr3[k / 2 - 1]) / 2.0;
    }

    static int removeDuplicates(int[] nums1) {
        int j = 1;
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] != nums1[i - 1]) {
                nums1[j] = nums1[i];
                j++;
            }
        }
        return j;
    }

    static int removeElement(int[] nums2, int val) {
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != val) {
                nums2[j] = nums2[i];
                j++;
            }
        }
        return j;
    }

    static int searchInsert(int[] arr, int target1) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target1) {
                return mid;
            } else if (arr[mid] > target1) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    static void merge(int[] num1, int m, int[] num2, int n) {
        for (int i = m, j = 0; j < n; j++) {
            num1[i] = num2[j];
            i++;
        }
        Arrays.sort(num1);
        for (int i : num1) {
            System.out.print(i + " ");
        }
    }

    static int singleNumber(int[] number) {
        for (int i = 0; i < number.length; i++) {
            boolean flag = false;
            for (int j = 0; j < number.length; j++) {
                if (number[i] == number[j] && i != j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return number[i];
            }
        }
        return -1;
    }

    static boolean containsDuplicate(int[] numbers) {
        boolean flag = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

}