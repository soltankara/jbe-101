package az.turing.adventuregame.location;

import az.turing.adventuregame.menu.Player;

public abstract class Location {

    Player player;
    String locationName;

    public Location(Player player, String locationName) {
        this.player = player;
        this.locationName = locationName;
    }

   public abstract boolean selectLocation();
}
