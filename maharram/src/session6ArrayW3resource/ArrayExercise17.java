//17. Write a Java program to find the second-largest element in an array.
package session6ArrayW3resource;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExercise17 {
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
        int secondLargestElement = findSecondLargestNumber(array);
        if (secondLargestElement != Integer.MIN_VALUE) {
            System.out.println("the second largest element : " + secondLargestElement);
        } else {
            System.out.println("The array doesn't have enough element ");
        }
    }
    public static int findSecondLargestNumber(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];
            } else if (arr[i] > secondLargestNumber && largestNumber != arr[i]) {
                secondLargestNumber = arr[i];
            }
        }
        return secondLargestNumber;
    }
}

