package session6;

import java.util.Scanner;

// 6 - Write a Java program to find the index of an array element.
public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int num = scanner.nextInt();

        int[] array = new int[num];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the number you want to see index: ");
        int testnum = scanner.nextInt();

        int tested = indexof(array, testnum);

        if (tested!=-1) System.out.println(tested);
        else System.out.println("Not Found");
    }

    public static int indexof(int[] array, int testnum) {
        for (int i = 0; i < array.length; i++) {
            if (testnum == array[i]) return i;
        }
        return -1;
    }
}

