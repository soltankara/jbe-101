package session24;

import java.util.Random;
import java.util.Scanner;

public class ShipBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] arr = new String[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = "-";
            }
        }
        Random random = new Random();
        int row = random.nextInt(5);
        int column = random.nextInt(5);
        String target = arr[row][column];
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            int entRow = getValidInput(scan, "Enter row number: ") - 1;
            int entColumn = getValidInput(scan, "Enter column number: ") - 1;
            if ((entRow >= 0 && entRow < 5) && (entColumn >= 0 && entColumn < 5)) {
                if (entRow == row && entColumn == column) {
                    System.out.println("You have won!");
                    arr[row][column] = "X";
                    break;
                } else {
                    arr[entRow][entColumn] = "*";
                }
            }
            print(arr);
        }
        print(arr);
    }

    public static void print(String[][] arr) {
        System.out.print("0 |");
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(" " + (j + 1) + " |");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j] + " |");
            }
            System.out.println();
        }
    }

    public static int getValidInput(Scanner scan, String message) {
        int number = -1;
        boolean flag = false;
        while (!flag) {
            System.out.print(message);
            String input = scan.next();
            try {
                number = Integer.parseInt(input);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please, enter again.");
            }
        }
        return number;
    }

}
