package mobileGamesLibraryFirstApp.service;


import mobileGamesLibraryFirstApp.model.Game;
import mobileGamesLibraryFirstApp.model.GameCategory;

public interface GameLibrary {
    void addGame(Game game);

    void deleteGame(String gameName, GameCategory category);

    Game searchGame(String gameName, GameCategory category);

    void displayAllGames();
}