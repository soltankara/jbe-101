package Session7Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int[] nums = {4,6,5,5,4,6,4,6,2,8};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum/nums.length);
    }
}
