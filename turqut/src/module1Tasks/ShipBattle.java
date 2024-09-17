package module1Tasks;

import java.util.Random;
import java.util.Scanner;

public class ShipBattle {
    public static void main(String[] args) {
        char[][] square = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square[i][j] = '-';
            }
        }

        Random random = new Random();
        int targetR = random.nextInt(5);
        int targetC = random.nextInt(5);

        Scanner scanner = new Scanner(System.in);

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            int r = getInput(scanner, "Enter row (1-5): ") - 1;
            int c = getInput(scanner, "Enter column (1-5): ") - 1;

            if (square[r][c] == '*') {
                System.out.println("You already shot here. Try a different spot.");
            } else if (r == targetR && c == targetC) {
                square[r][c] = 'x';
                printSquare(square);
                System.out.println("You have won!");
                break;
            } else {
                square[r][c] = '*';
                printSquare(square);
            }
        }

        scanner.close();
    }

    public static int getInput(Scanner scanner, String text) {
        while (true) {
            System.out.print(text);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    return input;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
    }

    public static void printSquare(char[][] square) {

        System.out.print(" 0 | 1 | 2 | 3 | 4 | 5 |");
        System.out.println();

        for (int i = 0; i < square.length; i++) {
            System.out.print(" " + (i + 1) + " |");
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(" " + square[i][j] + " |");
            }
            System.out.println();
        }
    }
}
