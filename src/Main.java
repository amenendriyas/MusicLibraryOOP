public class Main {
    public static void main(String[] args) {
       
        MusicItem song = new Song("HOPE", " NF ", 3.5);
        MusicItem podcast = new Podcast("Wechew GooD", "Yonzima, Mahi & Bereket", 53.0, 12);
        
        System.out.println("========== Display Info =======");
        song.displayInfo();
        podcast.displayInfo();

        System.out.println("\n=== playing ===");

        ((Playable) song).play();
        ((Playable) podcast).play();



    }
}