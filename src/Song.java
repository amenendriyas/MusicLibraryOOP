public class Song extends MusicItem implements Playable {

    public Song(String title, String artist, double duration ) {
        super(title, artist, duration);
    }
    @override

    public void play(){
        System.out.println("Playing song: " + " by " + artist);
    }
}
