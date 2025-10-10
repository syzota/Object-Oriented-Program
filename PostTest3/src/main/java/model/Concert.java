package model;

import java.util.ArrayList;

public class Concert {
    private String name;
    private String location;
    private String date;
    private ArrayList<ArtistAbstract> lineup;

    public Concert(String name, String location, String date, ArrayList<ArtistAbstract> lineup) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.lineup = lineup;
    }

    public void displayConcert() {
        System.out.println("Concert  : " + name);
        System.out.println("Location : " + location);
        System.out.println("Date     : " + date);
        System.out.println("Lineup   : ");
        for (ArtistAbstract a : lineup) {
            System.out.println(" - " + a.getName());
        }
        System.out.println("===========================");
    }
}

