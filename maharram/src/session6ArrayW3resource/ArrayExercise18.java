//18. Write a Java program to find the second -smallest element in an array.
package session6ArrayW3resource;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("element " + (i + 1) + " :");
            array[i] = sc.nextInt();
        }
        System.out.println("the array which you created : " + Arrays.toString(array));
        int secondSmallestElement = findSecondSmallestNumber(array);
        if (secondSmallestElement != Integer.MAX_VALUE) {
            System.out.println("the second smallest element :" + secondSmallestElement);
        } else {
            System.out.println("the array doesn't have enough value");
        }
    }
    public static int findSecondSmallestNumber(int[] arr) {
        if (arr.length < 2) {
            return Integer.MAX_VALUE;
        }
        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = arr[i];
            } else if (arr[i] < secondSmallestNumber && smallestNumber != arr[i]) {
                secondSmallestNumber = arr[i];
            }
        }
        return secondSmallestNumber;
    }
}
