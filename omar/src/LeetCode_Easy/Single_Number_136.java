package LeetCode_Easy;

public class Single_Number_136 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,7,7,8,8,};
       singleNumber(arr);
    }
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= nums[i];//XOR(exclusiveOR) it stands like : 0^1=1,0^0=0
        }
        return res;
    }
}
