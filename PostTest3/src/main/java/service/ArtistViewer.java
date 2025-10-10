/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ArtistViewer {

    public static void showArtists() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            String query = "SELECT id, name, genre, country FROM artists";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("\n🎵 Our Artists' Database 🎵");
            System.out.println("---------------------------------------------------------------");
            while (rs.next()) {
                System.out.println("ID          : " + rs.getInt("id"));
                System.out.println("Nama Artis  : " + rs.getString("name"));
                System.out.println("Genre       : " + rs.getString("genre"));
                System.out.println("Negara Asal : " + rs.getString("country"));
                System.out.println("---------------------------------------------------------------");
            }

        } catch (Exception e) {
            System.out.println("Error retrieving data: " + e.getMessage());
        }
    }
}
