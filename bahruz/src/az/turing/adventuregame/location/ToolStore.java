package az.turing.adventuregame.location;

import az.turing.adventuregame.menu.Player;

public class ToolStore extends NormalLocation {


    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean selectLocation() {
        System.out.println("Welcome to the Magazin! \nYou can buy weapons or items!");

        return true;
    }
}
