package service;

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
            System.out.println("No concerts available.");
        } else {
            for (Concert c : concerts) {
                c.displayConcert();
            }
        }
    }

    public ArrayList<Concert> getConcerts() {
        return concerts;
    }
}
