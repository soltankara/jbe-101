package session7;

import java.util.Scanner;

public class Arrays19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number of rows: ");
        int n = sc.nextInt();
        System.out.print("The number of columns: ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        int [][] arr2 = new int[n][m];
        int [][] sumOf = new int[n][m];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                sumOf[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(sumOf[i][j] + " ");
            }
            System.out.println();
        }
    }
}
