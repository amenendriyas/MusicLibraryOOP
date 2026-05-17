package musiclibrary.models;

public class MusicItem {
   
    protected String title;
    protected String artist;
    protected double duration;

    public MusicItem(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " mins");
    }

    
}
