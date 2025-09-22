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

public class Concert {
    private String name;
    private String location;
    private String date;
    private ArrayList<Artist> lineup;

    public Concert(String name, String location, String date, ArrayList<Artist> lineup) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.lineup = lineup;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public ArrayList<Artist> getLineup() { return lineup; }
    public void setLineup(ArrayList<Artist> lineup) { this.lineup = lineup; }

    public void displayConcert() {
        System.out.println("Concert  : " + name);
        System.out.println("Location : " + location);
        System.out.println("Date     : " + date);
        System.out.println("Lineup   : ");
        for (Artist a : lineup) {
            System.out.println(" - " + a.getName());
        }
        System.out.println("===========================");
    }
}
