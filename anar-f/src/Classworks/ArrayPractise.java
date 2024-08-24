package Classworks;

import java.util.Random;
import java.util.Scanner;

public class ArrayPractise {
    public static void main(String[] args) {
        String[][] arr = new String[100][100];
        Random random = new Random();
        int target = random.nextInt();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + "|");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "|");
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextLine();
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }

    }
}
