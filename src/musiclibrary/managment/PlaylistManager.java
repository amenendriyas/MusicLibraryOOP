package musiclibrary.managment;

import java.util.ArrayList;
import musiclibrary.model.MusicItem;

public class PlaylistManager {

    private ArrayList<MusicItem> playlist;

    public PlaylistManager() {
        playlist = new ArrayList<>();

    }

    public void addItem(MusicItem item) {
        playlist.add(item);
        System.out.println("Added: " + item);
        
    }

    public void showPlaylist() {
        System.out.println("====playlist====");

        if (playlist.isEmpty()){
            System.out.println("playlist is empty");
            return;
        }

        for (MusicItem item : playlist) {
            item.displayInfo();
            System.out.println("........");
            
        }
    }
    
}
