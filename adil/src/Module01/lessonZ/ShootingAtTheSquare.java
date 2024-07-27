package Module01.lessonZ;

import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = '-';
            }
        }
        Random random = new Random();
        int n = random.nextInt(5) + 1;
        int m = random.nextInt(5) + 1;
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            int a, b;
            do {
                System.out.print("Enter the shooting row (1-5): ");
                a = sc.nextInt();
            } while (!isValid(a));
            System.out.println();
            do {
                System.out.print("Enter the shooting column (1-5): ");
                b = sc.nextInt();
            } while (!isValid(b));
            if (a == n && b == m) {
                System.out.println("You have won!");
                matrix[a - 1][b - 1] = 'x';
                printMatrix(matrix);
                break;
            } else {
                System.out.println("Try again");
                matrix[a - 1][b - 1] = '*';
                printMatrix(matrix);
            }
        }
    }

    private static boolean isValid(int n) {
        return n >= 1 && n <= 5;
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
