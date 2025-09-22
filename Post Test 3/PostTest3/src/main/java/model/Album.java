/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus GK
 */

import java.util.ArrayList;

public class Album {
    private String title;
    private int releaseYear;
    private Artist artist;
    private ArrayList<String> tracklist;

    public Album(String title, int releaseYear, Artist artist, ArrayList<String> tracklist) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.artist = artist;
        this.tracklist = tracklist;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public Artist getArtist() { return artist; }
    public void setArtist(Artist artist) { this.artist = artist; }

    public ArrayList<String> getTracklist() { return tracklist; }
    public void setTracklist(ArrayList<String> tracklist) { this.tracklist = tracklist; }

    public void displayAlbum() {
        System.out.println("Album    : " + title + " (" + releaseYear + ")");
        System.out.println("Artist   : " + artist.getName());
        System.out.println("Tracklist:");
        for (int i = 0; i < tracklist.size(); i++) {
            System.out.println("   " + (i + 1) + ". " + tracklist.get(i));
        }
        System.out.println("===========================");
    }
}

