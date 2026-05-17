package musiclibrary;

import java.util.Scanner;

import musiclibrary.model.Song;
import musiclibrary.model.Podcast;
import musiclibrary.managment.PlaylistManager; 

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PlaylistManager manager = new PlaylistManager();

        while (true) {

            System.out.println("\n=== MUSIC LIBRARY MENU ===");
            System.out.println("1. Add Song");
            System.out.println("2. Add Podcast");
            System.out.println("3. View Playlist");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = 0;

            try{
                choice = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number. ");
                input.nextLine(); // clear 
                continue;
            }

            if (choice == 1) {

                System.out.print("Enter song title: ");
                String title = input.nextLine();

                System.out.print("Enter artist: ");
                String artist = input.nextLine();

                System.out.print("Enter duration: ");
                double duration = input.nextDouble();
                input.nextLine();

                Song song = new Song(title, artist, duration);
                manager.addItem(song);

            } 
            else if (choice == 2) {

                System.out.print("Enter podcast title: ");
                String title = input.nextLine();

                System.out.print("Enter host: ");
                String host = input.nextLine();

                System.out.print("Enter duration: ");
                double duration = input.nextDouble();

                System.out.print("Enter episode number: ");
                int episode = input.nextInt();
                input.nextLine();

                Podcast podcast = new Podcast(title, host, duration, episode);
                manager.addItem(podcast);

            } 
            else if (choice == 3) {
                manager.showPlaylist();
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}