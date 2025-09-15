/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Artist;

public class ArtistService {
    private ArrayList<Artist> artists = new ArrayList<>();

    public void addArtist(Artist artist) {
        artists.add(artist);
        System.out.println("The artist added to our data successfully!");
    }

    public void viewArtists() {
        if (artists.isEmpty()) {
            System.out.println("There are no artist that have been added.");
        } else {
            System.out.println("\n+-----------------------------------------+");
            System.out.println("|       UNIVERSAL MUSIC GROUP (UMG)       |");
            System.out.println("|            OUR ARTISTS LIST             |");
            System.out.println("+-----------------------------------------+");
            for (int i = 0; i < artists.size(); i++) {
                artists.get(i).displayInfo(i);
            }
        }
    }

    public void updateArtist(int index, String newName, String newGenre, String newCountry) {
        if (index >= 0 && index < artists.size()) {
            artists.get(index).setName(newName);
            artists.get(index).setGenre(newGenre);
            artists.get(index).setCountry(newCountry);
            System.out.println("The artist's data have been updated successfully!");
        } else {
            System.out.println("Enter the right number, please!");
        }
    }

    public void deleteArtist(int index) {
        if (index >= 0 && index < artists.size()) {
            artists.remove(index);
            System.out.println("The artist's data have been deleted successfully!");
        } else {
            System.out.println("Enter the right number, please!");
        }
    }

    public void searchArtist(String keyword) {
        boolean found = false;
        System.out.println("\nSearch results for: " + keyword);
        for (int i = 0; i < artists.size(); i++) {
            if (artists.get(i).getName().toLowerCase().contains(keyword.toLowerCase())) {
                artists.get(i).displayInfo(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No artists found!");
        }
    }
}
