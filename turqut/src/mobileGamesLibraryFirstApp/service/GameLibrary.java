package turqut.src.mobileGamesLibraryFirstApp.service;


import turqut.src.mobileGamesLibraryFirstApp.model.Game;
import turqut.src.mobileGamesLibraryFirstApp.model.GameCategory;

public interface GameLibrary {
    void addGame(Game game);

    void deleteGame(String gameName, GameCategory category);

    Game searchGame(String gameName, GameCategory category);

    void displayAllGames();
}