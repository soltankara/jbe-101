package LeetCode_Easy;

import java.util.Arrays;

public class Remove_element_26 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 6, 6, 3, 3, 4, 4, 2, 4, 5, 6, 9};
        System.out.println(removeElement(arr, 6));
    }

    public static int removeElement(int[] nums, int val) {

        int[] arr = new int[nums.length];
        int k =0;
        for (int i = 0; i < arr.length; i++) {
            if (nums[i] != val) {
                arr[k] = nums[i];
                k++;
            }
        }
        // mentiqe esasen for icindeki kod target elementi remove edir sualda sorusur ki yeni yaratdigim arrayin
        // element sayini cap et yeni uzunluguunu amma cap olunmur :(((

        return arr.length -(arr.length - k);
    }
}

