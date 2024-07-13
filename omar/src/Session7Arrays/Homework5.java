package Session7Arrays;

public class Homework5 {
    public static void main(String[] args) {
        int[] nums = {4, 6, 5, 5, 4, 6, 4, 6, 2, 8};
        int target = 8;
        boolean answer = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                answer = true;
                break;
            }
        }
        if (answer) {
            System.out.println("The target is " + target);
        } else {
            System.out.println("The target is not in the array");
        }
    }

}
