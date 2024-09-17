import java.util.Random;
import java.util.Scanner;

public class ShipBattle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] field = new char[6][6];

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                field[i][j] = '-';
            }
        }

        int targetRow = random.nextInt(5) + 1;
        int targetColumn = random.nextInt(5) + 1;

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            int row = getInput(scanner, "Enter a row (1-5): ");
            int col = getInput(scanner, "Enter a column (1-5): ");

            if (row == targetRow && col == targetColumn) {
                field[row][col] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            } else {
                field[row][col] = '*';
            }

            printField(field);
        }

        scanner.close();
    }

    private static int getInput(Scanner scanner, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("That's not a valid number. Please enter a number between 1 and 5.");
                scanner.next();
            }
        }
        return input;
    }

    private static void printField(char[][] field) {
        System.out.print("  ");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < 6; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
