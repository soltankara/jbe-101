//45. Jump Game II
package Session17_Leetcode.Medium;
import java.util.Arrays;
import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("number " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println("array : " + Arrays.toString(array));
        System.out.println(jump(array));

    }

    public static int jump(int[] array) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < array.length - 1; i++) {
            farthest = Math.max(farthest, i + array[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
