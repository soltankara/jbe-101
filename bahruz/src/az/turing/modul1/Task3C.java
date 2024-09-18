package az.turing.modul1;

import java.util.Random;
import java.util.Scanner;

public class Task3C {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[][] board = new int[5][5];
        Random random = new Random();

        int targetRow = random.nextInt(5);
        int targetColumn = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");
        int count = 1;

        while (true) {

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 0) {
                        System.out.print("- ");
                    } else if (board[i][j] == 1) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

            System.out.print("Enter the row (1-5): ");
            int row = sc.nextInt() - 1;
            while (row < 0 || row > 4) {
                System.out.println("Please enter a valid row between 1 and 5!");
                row = sc.nextInt() - 1;
            }

            System.out.print("Enter the column (1-5): ");
            int column = sc.nextInt() - 1;
            while (column < 0 || column > 4) {
                System.out.println("Please enter a valid column between 1 and 5!");
                column = sc.nextInt() - 1;
            }

            if (board[row][column] == 1) {
                System.out.println("You already shot here. Try again.");
                continue;
            }

            if (row == targetRow && column == targetColumn) {
                System.out.println("You have won!");
                board[row][column] = 2;
                break; //
            } else {
                System.out.println("Missed! Try again.");
                board[row][column] = 1;
            }
            count++;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == targetRow && j == targetColumn) {
                    System.out.print(" x ");
                } else if (board[i][j] == 0) {
                    System.out.print(" - ");
                } else if (board[i][j] == 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println("You has been won " + count + " times!");


        sc.close();
    }
}