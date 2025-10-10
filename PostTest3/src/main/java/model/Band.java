/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus GK
 */

package model;

import java.util.ArrayList;

public class Band extends Artist {
    private ArrayList<String> members;

    public Band(String name, String genre, String country, int debutYear, String label, String manager, ArrayList<String> members) {
        super(name, genre, country, debutYear, label, manager);
        this.members = members;
    }

    public ArrayList<String> getMembers() { return members; }
    public void setMembers(ArrayList<String> members) { this.members = members; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type   : Band");
        System.out.println("Members: " + String.join(", ", members));
        System.out.println("------------------------------");
    }
}
