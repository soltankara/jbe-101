package az.turing.adventuregame.menu;

import az.turing.adventuregame.location.Location;
import az.turing.adventuregame.location.SafeHouse;
import az.turing.adventuregame.location.ToolStore;

import java.util.Scanner;

public class Game {

    private Scanner sc = new Scanner(System.in);

    public void startGame() {
        System.out.println("------WELCOME TO ADVENTURE GAME--------");
        System.out.print("Please,enter your name: ");
        String name = sc.nextLine();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Hello " + name + ".Welcome to this foggy and dark island.Everything here is real");
        System.out.println("-------------------------------------------------------------------------");
        Player player = new Player(name);
        player.selectChar();
        System.out.println("-------------------------------------------------------------------------");
        while (true) {
            Location location;
            System.out.println("-----------------------------------------------------------");
            System.out.println("Choose the location:");
            System.out.println("1.Safe House");
            System.out.println("2.Tool Store ");
            System.out.println("-----------------------------------------------------------");
            int selectLoc = sc.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;

            }
            if (!location.selectLocation()) {
                System.out.println("GAME OVER");
                break;
            }

        }

    }

}
