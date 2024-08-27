package algorithm;

public class SearchingInArray {
    //linear search
    public int searching(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchingInArray saerch = new SearchingInArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = saerch.searching(nums, 0);
        System.out.println(result);
    }
}
