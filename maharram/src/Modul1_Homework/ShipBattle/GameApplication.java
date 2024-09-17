package Modul1_Homework.ShipBattle;
import java.util.Scanner;
public class GameApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameArea gameArea = new GameArea();
        gameArea.setTarget();
        Game game = new Game(gameArea, sc);
        game.startGame();
        sc.close();
    }
}
