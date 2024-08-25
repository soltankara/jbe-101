//1. Two sum
package Session17_Leetcode.Easy;
import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("number" + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println("array :" + Arrays.toString(array));
        System.out.print("enter a target number : ");
        int target = sc.nextInt();
        int[] result = TwoSum.twoSum(array, target);
        System.out.println("the indexs : " + Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return  new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

