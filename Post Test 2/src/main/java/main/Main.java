/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import service.ArtistService;
import model.Artist;

/**
 *
 * @author Asus GK
 */

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArtistService service = new ArtistService();
            boolean running = true;
            
            while (running) {
                System.out.println("\n+-----------------------------------------+");
                System.out.println("|       UNIVERSAL MUSIC GROUP (UMG)       |");
                System.out.println("|       ARTIST MANAGEMENT SYSTEM          |");
                System.out.println("+-----------------------------------------+");
                System.out.println("1. Add Artist");
                System.out.println("2. View Artist");
                System.out.println("3. Update Artist");
                System.out.println("4. Delete Artist");
                System.out.println("5. Search Artist");
                System.out.println("6. Exit");
                System.out.print("Choose the number between 1 to 6: ");
                
                int pilih = -1;
                try {
                    pilih = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Enter the right thing, please!");
                    sc.nextLine();
                    continue;
                }
                
                switch (pilih) {
                    case 1:
                        System.out.print("Add the new artist's name   : ");
                        String name = sc.nextLine();
                        System.out.print("Add their genre             : ");
                        String genre = sc.nextLine();
                        System.out.print("Add their country           : ");
                        String country = sc.nextLine();
                        service.addArtist(new Artist(name, genre, country));
                        break;
                        
                    case 2:
                        service.viewArtists();
                        break;
                        
                    case 3:
                        try {
                            System.out.print("Insert the number of the artist you want to update: ");
                            int idxU = sc.nextInt() - 1;
                            sc.nextLine();
                            System.out.print("New name: ");
                            String newName = sc.nextLine();
                            System.out.print("New genre: ");
                            String newCountry = sc.nextLine();
                            System.out.print("New country: ");
                            String newGenre = sc.nextLine();
                            service.updateArtist(idxU, newName, newGenre, newCountry);
                        } catch (Exception e) {
                            System.out.println("Enter the right number, please!");
                            sc.nextLine();
                        }
                        break;
                        
                    case 4:
                        try {
                            System.out.print("Insert the number of the artist you want to delete: ");
                            int idxD = sc.nextInt() - 1;
                            sc.nextLine();
                            service.deleteArtist(idxD);
                        } catch (Exception e) {
                            System.out.println("Enter the right number, please!");
                            sc.nextLine();
                        }
                        break;
                        
                    case 5:
                        System.out.print("Enter keyword to search: ");
                        String keyword = sc.nextLine();
                        service.searchArtist(keyword);
                        break;
                        
                    case 6:
                        running = false;
                        System.out.println("Bye!");
                        break;
                        
                    default:
                        System.out.println("Enter the right thing, please!");
                }
            }
        }
    }
}
