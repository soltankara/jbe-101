package session17;

import java.util.Arrays;

public class MergedArraysMedian {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        Arrays.sort(mergedArray);

        int length = mergedArray.length;
        if (length % 2 == 0) {
            return (mergedArray[length / 2 - 1] + mergedArray[length / 2]) / 2.0;
        } else {
            return mergedArray[length / 2];
        }
    }
}