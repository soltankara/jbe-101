package az.turing.adventuregame.menu;

import az.turing.adventuregame.character.Archer;
import az.turing.adventuregame.character.GameChar;
import az.turing.adventuregame.character.Knight;
import az.turing.adventuregame.character.Samurai;

import java.util.Scanner;

public class Player {
    private Scanner sc = new Scanner(System.in);
    private String playerName;
    private Integer damage;
    private Integer money;
    private Integer health;

    public void selectChar() {
        GameChar gameChar[] = {new Samurai(), new Archer(), new Knight()};
        System.out.println("All characters:");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (GameChar aChar : gameChar) {
            System.out.println("CharacterID: " + aChar.getCharId() +
                    "\t\tCharacterName: " + aChar.getName() +
                    "\t\tDamage: " + aChar.getDamage() +
                    "\t\tHealth: " + aChar.getHealth() +
                    "\t\tMoney: " + aChar.getMoney());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Please,Choose the CharacterId!");
        Integer selectChar = sc.nextInt();
        switch (selectChar) {
            case 1:
                inputChar(new Samurai());
                break;
            case 2:
                inputChar(new Archer());
                break;
            case 3:
                inputChar(new Knight());
                break;
            default:
                inputChar(new Samurai());
        }

    }

    public void inputChar(GameChar gameChar) {
        System.out.println(gameChar.toString());
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
