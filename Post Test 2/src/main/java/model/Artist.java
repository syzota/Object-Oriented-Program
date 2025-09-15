/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Artist {
    private String name;
    private String genre;
    private String country;

    public Artist(String name, String genre, String country) {
        this.name = name;
        this.genre = genre;
        this.country = country;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public void displayInfo(int index) {
    System.out.println("[" + (index + 1) + "] " + name);
    System.out.println("    Genre  : " + genre);
    System.out.println("    Country: " + country);
    System.out.println("---------------------------");
    }
}

