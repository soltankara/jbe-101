//26. Remove Duplicates from Sorted Array
package Session17_Leetcode.Easy;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicates {
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
        int s = removeDublicate(array);
        System.out.println(s);
        System.out.print("dublicate array  : ");
        for (int i = 0; i < s; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDublicate(int[] array) {
        if (array.length == 0)
            return 0;
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }
        return j + 1;
    }
}
