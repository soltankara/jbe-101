package module1.fopProjects.shootingAtTheSquare;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        char[][] board = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '-';
            }
        }

        Random rand = new Random();
        int randomRow = rand.nextInt(5);
        int randomCol = rand.nextInt(5);

        Scanner scan = new Scanner(System.in);
        while (true) {
            int row = -1;
            int col = -1;

            while (true) {
                System.out.print("Enter a row: ");
                if (scan.hasNextInt()) {
                    row = scan.nextInt() - 1;
                    if (row >= 0 && row < 5) {
                        break;
                    }
                } else {
                    scan.next();
                }
                System.out.println("Please enter a valid row.");
            }

            while (true) {
                System.out.print("Enter a column: ");
                if (scan.hasNextInt()) {
                    col = scan.nextInt() - 1;
                    if (col >= 0 && col < 5) {
                        break;
                    }
                } else {
                    scan.next();
                }
                System.out.println("Please enter a valid column.");
            }


            if (randomRow == row && randomCol == col) {
                board[row][col] = 'x';
                System.out.println("You have won!");
                break;
            } else {
                board[row][col] = '*';
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
