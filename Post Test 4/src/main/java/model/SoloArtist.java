/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class SoloArtist extends Artist {
    private String nickname;

    public SoloArtist(String name, String genre, String country, int debutYear, String label, String manager, String nickname) {
        super(name, genre, country, debutYear, label, manager);
        this.nickname = nickname;
    }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type   : Solo Artist");
        System.out.println("Nickname: " + nickname);
        System.out.println("------------------------------");
    }
}
