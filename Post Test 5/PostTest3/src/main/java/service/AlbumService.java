package service;

import java.util.ArrayList;
import model.Album;

public class AlbumService {
    private ArrayList<Album> albums = new ArrayList<>();

    public void addAlbum(Album album) {
        albums.add(album);
        System.out.println("Album added successfully!");
    }

    public void viewAlbums() {
        if (albums.isEmpty()) {
            System.out.println("No albums available.");
        } else {
            for (Album a : albums) {
                a.displayAlbum();
            }
        }
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }
}
