public class Main {
    public static void main(String[] args) {

        int[] nums ={3,5,3,5,6,32,6,2,4};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    System.out.println(nums[i]);
                }
            }
        }
    }
}