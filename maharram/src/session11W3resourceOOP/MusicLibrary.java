package session11W3resourceOOP;
import java.util.Random;
public class MusicLibrary {
    private String[] songs;
    private int countOfSong;

    public MusicLibrary(int maxCountOfSong) {
        this.songs = new String[maxCountOfSong];
        this.countOfSong = 0;
    }

    public void addSong(String song) {
        if (countOfSong < songs.length) {
            songs[countOfSong] = song;
            countOfSong++;
            System.out.println(song + " added ");
        } else {
            System.out.println("there is not enough place");
        }
    }

    public void removeSong(String song) {
        boolean found = false;
        for (int i = 0; i < countOfSong; i++) {
            if (songs[i].equals(song)) {
                found = true;
                for (int j = i; j < countOfSong - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songs[countOfSong - 1] = null;
                countOfSong--;
                System.out.println(song + " removed ");
                break;
            }
        }
        if (!found) {
            System.out.println(song + "was not found");
        }
    }

    public void playRandomSongs() {
        if (countOfSong > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(countOfSong);
            System.out.println("now playing :" + songs[randomIndex]);
        } else {
            System.out.println("there is no any msuic in Library");
        }
    }

    public void showSongs() {
        System.out.print("songs :");
        for (int i = 0; i < countOfSong; i++) {
            System.out.print(songs[i]+"  ");
        }
        System.out.println();
    }
}
