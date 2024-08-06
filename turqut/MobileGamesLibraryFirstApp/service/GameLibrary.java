package turqut.MobileGamesLibraryFirstApp.service;


import turqut.MobileGamesLibraryFirstApp.model.Game;
import turqut.MobileGamesLibraryFirstApp.model.GameCategory;

public interface GameLibrary {
    void addGame(Game game);

    void deleteGame(String gameName, GameCategory category);

    Game searchGame(String gameName, GameCategory category);

    void displayAllGames();
}