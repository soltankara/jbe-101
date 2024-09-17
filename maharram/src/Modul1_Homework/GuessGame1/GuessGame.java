package Modul1_Homework.GuessGame1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private int randomNumber;
    private Players player;

    public GuessGame(Players player) {
        this.player = player;
        Random random = new Random();
        this.randomNumber = random.nextInt(101);
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let the Game begin ");
        while (true) {
            System.out.print("please guess the number : ");
            while (!sc.hasNextInt()) {
                System.out.println("invalid input, pls enter a valid number ");
                sc.next();
            }
            int userGuess = sc.nextInt();
            player.addGuess(userGuess);
            if (userGuess > randomNumber) {
                System.out.println("your guess is too big.please ,try again ");
            } else if (userGuess < randomNumber) {
                System.out.println("your guess is too small. please ,try again ");
            } else {
                System.out.println("congratulations  " + player.getName());
                break;
            }
        }
        int[] guessedNumbers = player.getGuessedNumbers();
        Arrays.sort(guessedNumbers);
        reverseArray(guessedNumbers);
        System.out.println("guessed numbers : " + Arrays.toString(guessedNumbers));
        System.out.println("you tried "+player.getGuessCount()+" time");
    }

    private void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
