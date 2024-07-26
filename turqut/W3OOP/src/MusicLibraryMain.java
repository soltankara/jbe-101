public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();

        Song song1 = new Song("Easy Job", "Paster");
        Song song2 = new Song("MNML", "Xpert");
        Song song3 = new Song("OG", "Saybu Swag");

        musicLibrary.addSong(song1);
        musicLibrary.addSong(song2);
        musicLibrary.addSong(song3);

        System.out.println("Music Library : ");
        System.out.println();
        for (Song song : musicLibrary.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        musicLibrary.removeSong(song2);

        System.out.println();
        System.out.println("Updated Music Library : ");
        for (Song song : musicLibrary.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        System.out.println("Play a random song : ");
        musicLibrary.playRandomSong();


    }
}
