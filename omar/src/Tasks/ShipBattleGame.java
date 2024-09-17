package Tasks;

import java.util.Random;
import java.util.Scanner;

public class ShipBattleGame {
    public static void main(String[] args) {
        // Initialize game board and place ships
        char[][] board = new char[5][5];
        boolean[][] ships = new boolean[5][5];
        int numShips = 3;  // Number of ships to place

        initializeBoard(board);
        placeShips(ships, numShips);

        int shipsLeft = numShips;
        int attempts = 0;

        System.out.println("Welcome to Battleship!");
        printBoard(board);

        // Start game loop
        Scanner scanner = new Scanner(System.in);

        while (shipsLeft > 0) {
            System.out.println("\nEnter your guess (row and column): ");
            System.out.print("Row (0-4): ");
            int row = scanner.nextInt();
            System.out.print("Column (0-4): ");
            int col = scanner.nextInt();

            // Check for valid input
            if (row < 0 || row > 4 || col < 0 || col > 4) {
                System.out.println("Invalid input! Please enter numbers between 0 and 4.");
                continue;
            }

            attempts++;

            // Check if the player hit a ship
            if (ships[row][col]) {
                board[row][col] = 'X';  // Mark hit
                ships[row][col] = false; // Remove ship
                shipsLeft--;
                System.out.println("Hit! " + shipsLeft + " ship(s) remaining.");
            } else if (board[row][col] == '-') {
                System.out.println("You've already guessed that location.");
            } else {
                board[row][col] = '-';  // Mark miss
                System.out.println("Miss!");
            }

            printBoard(board);
        }

        System.out.println("Congratulations! You've sunk all the ships in " + attempts + " attempts.");
        scanner.close();
    }

    // Initialize the game board with empty water
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '~';  // Water symbol
            }
        }
    }

    // Randomly place ships on the board
    public static void placeShips(boolean[][] ships, int numShips) {
        Random random = new Random();
        int placedShips = 0;

        while (placedShips < numShips) {
            int row = random.nextInt(5);
            int col = random.nextInt(5);

            if (!ships[row][col]) {  // Place ship if space is empty
                ships[row][col] = true;
                placedShips++;
            }
        }
    }

    // Print the current game board (without revealing ship locations)
    public static void printBoard(char[][] board) {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
