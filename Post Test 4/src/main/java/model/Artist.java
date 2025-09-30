/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Artist extends ArtistAbstract implements PerformableInt {

    public Artist(String name, String genre, String country, int debutYear, String label, String manager) {
        super(name, genre, country, debutYear, label, manager);
    }

    @Override
    public void displayInfo() {
        System.out.println("Artist: " + getName());
        System.out.println("Genre : " + getGenre());
        System.out.println("Country: " + getCountry());
        System.out.println("Debut : " + getDebutYear());
        System.out.println("Label : " + getLabel());
        System.out.println("Manager: " + getManager());
        System.out.println("------------------------------");
    }

    @Override
    public void perform() {
        System.out.println(getName() + " is performing live!");
    }
}

