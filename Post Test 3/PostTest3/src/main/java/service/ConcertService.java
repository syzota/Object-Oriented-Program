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
import model.Concert;

public class ConcertService {
    private ArrayList<Concert> concerts = new ArrayList<>();

    public void addConcert(Concert concert) {
        concerts.add(concert);
        System.out.println("Concert added successfully!");
    }

    public void viewConcerts() {
        if (concerts.isEmpty()) {
            System.out.println("No concerts found.");
        } else {
            for (Concert concert : concerts) {
                concert.displayConcert();
            }
        }
    }

    public ArrayList<Concert> getAllConcerts() {
        return concerts;
    }
}

