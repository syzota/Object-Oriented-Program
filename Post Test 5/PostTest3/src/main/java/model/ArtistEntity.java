/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus GK
 */
package model;

import jakarta.persistence.*;

@Entity
@Table(name = "artists")
public class ArtistEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String namaArtis;

    @Column(name = "genre")
    private String genre;

    @Column(name = "country")
    private String negaraAsal;



    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNamaArtis() { return namaArtis; }
    public void setNamaArtis(String namaArtis) { this.namaArtis = namaArtis; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getNegaraAsal() { return negaraAsal; }
    public void setNegaraAsal(String negaraAsal) { this.negaraAsal = negaraAsal; }

    @Override
    public String toString() {
        return String.format("Artis #%d | %s | %s | %s",
                id, namaArtis, genre, negaraAsal);
    }
}
