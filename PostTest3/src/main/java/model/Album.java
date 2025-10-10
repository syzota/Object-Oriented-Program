package model;

import java.util.ArrayList;

public class Album {
    private String title;
    private int releaseYear;
    private ArtistAbstract artist;
    private ArrayList<String> tracklist;

    public Album(String title, int releaseYear, ArtistAbstract artist, ArrayList<String> tracklist) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.artist = artist;
        this.tracklist = tracklist;
    }

    public void addTrack(String track) {
        this.tracklist.add(track);
    }

    public void addTrack(ArrayList<String> tracks) {
        this.tracklist.addAll(tracks);
    }

    public void displayAlbum() {
        System.out.println("Album    : " + title);
        System.out.println("Artist   : " + artist.getName());
        System.out.println("Released : " + releaseYear);
        System.out.println("Tracklist:");
        for (String track : tracklist) {
            System.out.println(" - " + track);
        }
        System.out.println("===========================");
    }
}
