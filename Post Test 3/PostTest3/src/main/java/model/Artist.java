/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Artist {
    private String name;
    private String genre;
    private String country;
    private int debutYear;
    private String label;
    private String manager;

    public Artist(String name, String genre, String country, int debutYear, String label, String manager) {
        this.name = name;
        this.genre = genre;
        this.country = country;
        this.debutYear = debutYear;
        this.label = label;
        this.manager = manager;
    }

    public Artist(String name, String genre, String country) {
        this(name, genre, country, 0, "-", "-");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public int getDebutYear() { return debutYear; }
    public void setDebutYear(int debutYear) { this.debutYear = debutYear; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    public String getManager() { return manager; }
    public void setManager(String manager) { this.manager = manager; }

    public void displayInfo() {
        System.out.println("Name      : " + name);
        System.out.println("Genre     : " + genre);
        System.out.println("Country   : " + country);
        System.out.println("Debut Year: " + debutYear);
        System.out.println("Label     : " + label);
        System.out.println("Manager   : " + manager);
        System.out.println("---------------------------------");
    }
}

