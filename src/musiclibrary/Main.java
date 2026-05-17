package musiclibrary;

import musiclibrary.model.MusicItem;
import musiclibrary.model.Playable;
import musiclibrary.model.Podcast;
import musiclibrary.model.Song;
import musiclibrary.managment.PlaylistManager;

public class Main {
    public static void main(String[] args) {

        PlaylistManager manager = new PlaylistManager();

        Song song1 = new Song("Nights ", "Frank Ocean", 5.06);
        Song song2 = new Song("Feels Like Summer", "Childish Gambino", 5.0);

        Podcast podcast1 = new Podcast ("The Future Mark Zuckerberg Is Trying To Build", "Cleo Abram", 47.0);

        manager.addItem(song1);
        manager.addItem(song2);
        manager.addItem(podcast1);

        manager.showPlaylist(); 
    }
}