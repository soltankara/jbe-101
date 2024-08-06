package turqut.src.mobileGamesLibraryFirstApp.model;

import org.junit.*;
import turqut.src.mobileGamesLibraryFirstApp.service.impl.MobileGamesLibraryImpl;

import static org.junit.Assert.*;

public class Testing {
    private static MobileGamesLibraryImpl library;

    @BeforeClass
    public static void setUp() {
        library = new MobileGamesLibraryImpl(100);
    }

    @Test
    public void testAddGame() {
        Game game1 = new Game("Game1", GameCategory.SIMULATION, 50);
        library.addGame(game1);
        assertEquals(game1, library.searchGame("Game1", GameCategory.SIMULATION));
    }

    @Test
    public void testDeleteGame() {
        Game game1 = new Game("Game1", GameCategory.SIMULATION, 50);
        library.addGame(game1);
        library.deleteGame("Game1", GameCategory.SIMULATION);
        assertNotNull(library.searchGame("Game1", GameCategory.SIMULATION));
    }
}