/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus GK
 */

public class Contract {
    private Artist artist;
    private String label;
    private int startYear;
    private int endYear;

    public Contract(Artist artist, String label, int startYear, int endYear) {
        this.artist = artist;
        this.label = label;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public Artist getArtist() { return artist; }
    public void setArtist(Artist artist) { this.artist = artist; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    public int getStartYear() { return startYear; }
    public void setStartYear(int startYear) { this.startYear = startYear; }

    public int getEndYear() { return endYear; }
    public void setEndYear(int endYear) { this.endYear = endYear; }

    public void displayContract() {
        System.out.println("Contract : " + artist.getName());
        System.out.println("Label    : " + label);
        System.out.println("Duration : " + startYear + " - " + endYear);
        System.out.println("===========================");
    }
}
