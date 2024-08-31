package Session7.W3School;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows of matrix : ");
        int rowSize = sc.nextInt();
        System.out.print("Input number of rows of matrix : ");
        int columnSize = sc.nextInt();
        int[][] arr = new int[rowSize][columnSize];
        int[][] arr2 = new int[rowSize][columnSize];
        System.out.println("-----------------------");
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.print("Input value of arr[" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("-----------------------");
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.print("Input value of arr2[" + i + "][" + j + "] : ");
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("-----------------------");
        System.out.println("arr 1 :");
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("arr 2 : ");
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------\n Sum of matrices : ");
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.print((arr[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
