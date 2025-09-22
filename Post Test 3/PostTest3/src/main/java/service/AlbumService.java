/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Asus GK
 */

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
            System.out.println("No albums found.");
        } else {
            for (Album album : albums) {
                album.displayAlbum();
            }
        }
    }

    public ArrayList<Album> getAllAlbums() {
        return albums;
    }
}

