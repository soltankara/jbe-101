package Module01.lessonZ;

import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquareAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = '-';
            }
        }
        Random random = new Random();
        boolean isHorizontal = random.nextBoolean();
        int n = random.nextInt(3) + 1;
        int m = random.nextInt(5) + 1;
        System.out.println("All set. Get ready to rumble!");
        int targetCounter = 0;
        while (targetCounter < 3) {
            int a, b;
            do {
                System.out.print("Enter the shooting row (1-5): ");
                a = sc.nextInt();
            } while (notValid(a));
            System.out.println();
            do {
                System.out.print("Enter the shooting column (1-5): ");
                b = sc.nextInt();
            } while (notValid(b));
            if (isHorizontal) {
                if ((a >= n && a <= n + 2) && b == m) {
                    matrix[a - 1][b - 1] = 'x';
                    targetCounter++;
                    printMatrix(matrix);
                } else {
                    System.out.println("Try again");
                    matrix[a - 1][b - 1] = '*';
                    printMatrix(matrix);
                }
            } else {
                if (a == m && (b >= n && b <= n + 2)) {
                    matrix[a - 1][b - 1] = 'x';
                    targetCounter++;
                    printMatrix(matrix);
                } else {
                    System.out.println("Try again");
                    matrix[a - 1][b - 1] = '*';
                    printMatrix(matrix);
                }
            }
        }
        System.out.println("You have won!");
    }

    private static boolean notValid(int n) {
        return n < 1 || n > 5;
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
