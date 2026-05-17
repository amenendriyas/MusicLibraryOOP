public class Podcast extends MusicItem implements Playable {
    
    private int episodeNumber;

    public Podcast(String title , String artist, double duration, int episodeNumber){
        super(title, artist, duration);
        this.episodeNumber = episodeNumber;
    }
    
    @Override
    public void play() {
        System.out.println("playing podcast: " + title + "episode" + episodeNumber + "by" + artist);
    }
}
