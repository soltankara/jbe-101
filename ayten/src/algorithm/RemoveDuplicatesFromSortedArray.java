package algorithm;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int size = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray duplicate = new RemoveDuplicatesFromSortedArray();
        int[] arr = {0, 0, 0, 1, 2, 2, 3, 3, 3, 4};
        System.out.println("Without Duplicates size : "+duplicate.removeDuplicates(arr));
    }
}
