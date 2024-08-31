package Session7.ArrayPractice;

import java.util.Scanner;

public class ArrayPracticeQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        for (int container : arr) {
            System.out.print(container + " ");
        }
        System.out.println();
        System.out.println("----------------------------");
        int firstIndex = 0, secondIndex = 0, it = 0;
        do {
            if (it > 0) {
                System.out.println("Unavailable index input! Try again");
            }
            it++;
            System.out.print("Enter first index [0, " + (arr.length - 1) + "] : ");
            firstIndex = sc.nextInt();
            System.out.print("Enter second index [0, " + (arr.length - 1) + "] : ");
            secondIndex = sc.nextInt();
        } while (firstIndex < 0 || firstIndex > arr.length - 1 || secondIndex < 0 || secondIndex > arr.length - 1);
        System.out.println("----------------------------");
        int temp = 0;
        temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
        System.out.print("new array -> ");
        for (int container : arr) {
            System.out.print(container + " ");
        }

    }
}
