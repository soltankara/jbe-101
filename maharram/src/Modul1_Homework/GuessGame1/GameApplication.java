package Modul1_Homework.GuessGame1;
import java.util.Scanner;
public class GameApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your name : ");
        String name = sc.nextLine();
        Players player = new Players(name);
        GuessGame game = new GuessGame(player);
        game.startGame();
    }
}
