package algorithm;

import java.util.Arrays;

public class MediaOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] mixed = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            mixed[k++] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            mixed[k++] = nums2[i];
        }
        Arrays.sort(mixed);
        int sizeArray = mixed.length;
        if (sizeArray % 2 == 1) {
            return (double) mixed[sizeArray / 2];
        } else {
            int median1 = mixed[sizeArray / 2 - 1];
            int median2 = mixed[sizeArray / 2];
            return ((double) median1 + (double) median2) / 2.0;
        }
    }

    public static void main(String[] args) {
        MediaOfTwoSortedArrays arrays = new MediaOfTwoSortedArrays();
        int[] arr1 = {2, 6, 8};
        int[] arr2 = {1, 5};
        System.out.println("The median is " + arrays.findMedianSortedArrays(arr1, arr2));

    }
}
