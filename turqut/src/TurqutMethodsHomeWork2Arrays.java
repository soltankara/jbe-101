package turqut.src;

import java.util.Arrays;
import java.util.Scanner;

/*
I solve 3 problems in LeetCode Array section. You can see the names of tasks in the comment.
And I to name the names of methods according to number of task.
 */
public class TurqutMethodsHomeWork2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ArrayTask1 - Concatenation of Array
        System.out.print("Enter the size : ");
        int size1 = sc.nextInt();
        System.out.print("nums = ");
        int[] nums1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }
        ArrayTask1(nums1);

        //ArrayTask2 - Difference Between Elements Sum and Digits Sum of an Array
        System.out.print("Enter the size : ");
        int size2 = sc.nextInt();
        System.out.print("nums = ");
        int[] nums2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(ArrayTask2(nums2));

        //ArrayTask3 - Runnig Sum of 1d Array
        System.out.print("Enter the size : ");
        int size3 = sc.nextInt();
        System.out.print("nums = ");
        int[] nums3 = new int[size3];
        for (int i = 0; i < size3; i++) {
            nums3[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ArrayTask3(nums3)));

    }

    private static void ArrayTask1(int[] nums1) {
        int[] result = new int[nums1.length * 2];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nums1[i];
            result[i + nums1.length] = nums1[i];
        }
        System.out.println("Result: " + Arrays.toString(result));
    }

    private static int ArrayTask2(int[] nums2) {
        int sumOfElements = 0;
        int sumOfDigits = 0;
        for (int num : nums2) {
            sumOfElements += num;
            while (num != 0) {
                sumOfDigits += num % 10;
                num /= 10;
            }
        }
        return sumOfElements - sumOfDigits;
    }

    private static int[] ArrayTask3(int[] nums3) {
        int[] result = new int[nums3.length];
        result[0] = nums3[0];
        for (int i = 1; i < nums3.length; i++) {
            result[i] = result[i - 1] + nums3[i];
        }
        return result;
    }

}

