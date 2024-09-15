package Modul1_Homework.ShipBattle;
import java.util.Random;
public class GameArea {
    public static final int size = 5;
    private char[][] gamePlace;
    private int[][] target;

    public GameArea() {
        gamePlace = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gamePlace[i][j] = '-';
            }
        }
    }

    public void setTarget() {
        Random random = new Random();
        boolean vertical = random.nextBoolean();
        target = new int[3][2];
        if (vertical) {
            int col = random.nextInt(size);
            int rowStarts = random.nextInt(size - 2);
            for (int i = 0; i < 3; i++) {
                target[i][0] = rowStarts + i;
                target[i][1] = col;
            }

        } else {
            int row = random.nextInt(size);
            int colStarts = random.nextInt(size - 2);
            for (int i = 0; i < 3; i++) {
                target[i][0] = row;
                target[i][1] = colStarts + i;
            }
        }
    }

    public boolean checkHit(int row, int col) {
        for (int[] cell : target) {
            if (cell[0] == row && cell[1] == col)
                return true;
        }
        return false;
    }

    public boolean isTargetDefeated() {
        for (int[] cell : target) {
            if (gamePlace[cell[0]][cell[1]] != 'x')
                return false;
        }
        return true;
    }

    public void markShot(int row, int col) {
        if (gamePlace[row][col] == '-') {
            gamePlace[row][col] = '*';
        }
    }


    public void markTarget() {
        for (int[] cell : target) {
            gamePlace[cell[0]][cell[1]] = 'x';
        }
    }

    public void displayGamePLace() {
        System.out.print("  | ");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " | ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < size; j++) {
                System.out.print(gamePlace[i][j] + " | ");
            }
            System.out.println();
        }
    }
}