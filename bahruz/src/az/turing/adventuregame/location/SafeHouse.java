package az.turing.adventuregame.location;

import az.turing.adventuregame.menu.Player;

public class SafeHouse extends NormalLocation {


    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean selectLocation() {
        System.out.println("You are in a safe house!");
        System.out.println("Your soul is fulled!");
        return true;
    }
}
