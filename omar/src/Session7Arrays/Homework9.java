package Session7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 5, 4, 6, 4, 6, 2, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to insert: ");
        int element = sc.nextInt();
        System.out.println("Enter the index of element you want : ");
        int index = sc.nextInt();

        // Check if the position is within the valid range
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid position");
        } else {
            // Create a new array with one extra space
            int[] newArr = new int[arr.length + 1];

            // Copy elements from the original array to the new array
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else if (i == index) {
                    newArr[i] = element;
                } else {
                    newArr[i] = arr[i - 1];
                }
            }

            // Print the new array
            System.out.println("Array after inserting " + element + " at position " + index + ":");
            System.out.println(Arrays.toString(newArr));
        }
    }
}
