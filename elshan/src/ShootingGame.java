import java.util.Random;
import java.util.Scanner;

public class ShootingGame {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = '-';
            }
        }
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);
 //       System.out.println(targetRow + " " + targetCol);

        System.out.println("All set. Get ready to rumble!");
        boolean won = false;

        while (!won) {
            int row = -1;
            int col = -1;


            while (row < 1 || row > 5) {
                System.out.println("Enter the row 1-5 to shoot: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    scanner.next();
                }
                row = scanner.nextInt();
                if (row < 1 || row > 5) {
                    System.out.println("Invalid row. Please enter a number between 1 and 5.");
                }
            }


            while (col < 1 || col > 5) {
                System.out.println("Enter the col 1-5 to shoot: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    scanner.next();
                }
                col = scanner.nextInt();
                if (col < 1 || col > 5) {
                    System.out.println("Invalid col. Please enter a number between 1 and 5.");
                }
            }


            if (row == targetRow && col == targetCol) {
                matrix[row-1][col-1] = 'x';
                won = true;
            } else {
                matrix[row-1][col-1] = '*';
            }

            printMatrix(matrix);
        }

        System.out.println("You have won!");
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


