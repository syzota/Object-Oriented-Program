/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Asus GK
 */

import model.ArtistEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ArtistORMService {

    // View all artists
    public static void viewAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<ArtistEntity> list = session.createQuery("FROM ArtistEntity", ArtistEntity.class).list();
            System.out.println("\n🎶 DATA ARTIS (ORM - HIBERNATE) 🎶");
            for (ArtistEntity artist : list) {
                System.out.println(artist);
            }
        }
    }

    // Add new artist
    public static void addArtist(String nama, String genre, String negara, String email, int followers, int sales) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            ArtistEntity artist = new ArtistEntity();
            artist.setNamaArtis(nama);
            artist.setGenre(genre);
            artist.setNegaraAsal(negara);
            session.persist(artist);
            tx.commit();
            System.out.println("✅ Artist berhasil ditambahkan via ORM!");
        }
    }
}
