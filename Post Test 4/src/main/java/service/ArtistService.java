package service;

import java.util.ArrayList;
import model.ArtistAbstract;

public class ArtistService {
    private ArrayList<ArtistAbstract> artists = new ArrayList<>();

    public void addArtist(ArtistAbstract artist) {
        artists.add(artist);
        System.out.println("Artist added successfully!");
    }

    public void viewArtists() {
        if (artists.isEmpty()) {
            System.out.println("No artists available.");
        } else {
            int i = 1;
            for (ArtistAbstract a : artists) {
                System.out.println("[" + i + "]");
                a.displayInfo(); // Polymorphism: override di Band / SoloArtist
                i++;
            }
        }
    }

    public void updateArtist(int index, String newName, String newGenre, String newCountry) {
        if (index >= 0 && index < artists.size()) {
            ArtistAbstract a = artists.get(index);
            a.setName(newName);
            a.setGenre(newGenre);
            a.setCountry(newCountry);
            System.out.println("Artist updated successfully!");
        } else {
            System.out.println("Invalid artist index.");
        }
    }

    public void deleteArtist(int index) {
        if (index >= 0 && index < artists.size()) {
            artists.remove(index);
            System.out.println("Artist deleted successfully!");
        } else {
            System.out.println("Invalid artist index.");
        }
    }

    public void searchArtist(String keyword) {
        boolean found = false;
        for (ArtistAbstract a : artists) {
            if (a.getName().toLowerCase().contains(keyword.toLowerCase())) {
                a.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No artist found with keyword: " + keyword);
        }
    }

    public ArrayList<ArtistAbstract> getArtists() {
        return artists;
    }
}
