package az.turing.adventuregame.location;

import az.turing.adventuregame.menu.Player;

public  abstract class NormalLocation extends Location {


    public NormalLocation(Player player, String locationName) {
        super(player, locationName);
    }

    @Override
    public boolean selectLocation() {
        return false;
    }
}
