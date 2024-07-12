package session6;

import java.util.Scanner;

// 5 - Write a Java program to test if an array contains a specific value.
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int num = scanner.nextInt();

        int[] array = new int[num];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number you want to test: ");
        int testnum = scanner.nextInt();

        boolean contain = test(array, testnum);
        if (contain) System.out.println("YES");
        else System.out.println("NO");

    }

    public static boolean test(int[] array, int testnum) {
        for (int num : array) {
            if (num == testnum) return true;
        }
        return false;
    }
}
