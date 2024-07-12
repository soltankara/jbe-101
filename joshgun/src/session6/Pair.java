package session6;

import java.util.Scanner;

// 22 - Write a Java program to find all pairs
// of elements in an array whose sum is equal to a specified number.
public class Pair {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 3, 2, 6, 5, 78, 75, 8, 35, 9};

        System.out.print("Enter the sum you want to see: ");
        int sum= scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==sum) System.out.println(array[i] + " + " + array[j]);
            }
        }
    }
}
