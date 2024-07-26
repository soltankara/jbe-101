import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<Song> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void playRandomSong() {
        int length = songs.size();

        if (length == 0) {
            System.out.println("There is no song in music library.");
            return;
        }

        Random random = new Random();

        int index = random.nextInt(length);

        System.out.println("Now playing " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist() + ".");
    }
}
