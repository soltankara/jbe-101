//10. Write a Java program to find the maximum and minimum value of an array.
package session6ArrayW3resource;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayexercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array  : ");
        int size10 = sc.nextInt();
        int[] array10 = new int[size10];
        for (int i = 0; i < size10; i++) {
            System.out.print("element  " + (i + 1) + "  : ");
            array10[i] = sc.nextInt();
        }
        int maxvalue = findmax(array10);
        int minvalue = findmin(array10);
        System.out.println("the array which you created  :" + Arrays.toString(array10));
        System.out.println("the max value in this array  :" + maxvalue);
        System.out.println("the min value in this array  :" + minvalue);
    }
    public static int findmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findmin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
