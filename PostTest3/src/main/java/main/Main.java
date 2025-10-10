package main;

import java.util.ArrayList;
import java.util.Scanner;
import service.*;
import model.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArtistService artistService = new ArtistService();
            AlbumService albumService = new AlbumService();
            ConcertService concertService = new ConcertService();
            ContractService contractService = new ContractService();

            DataSeeder.seed(artistService, albumService, concertService, contractService);

            boolean running = true;

            while (running) {
                System.out.println("\n+-----------------------------------------+");
                System.out.println("|       UNIVERSAL MUSIC GROUP (UMG)       |");
                System.out.println("|       ARTIST MANAGEMENT SYSTEM          |");
                System.out.println("+-----------------------------------------+");
                System.out.println("1. Add Artist");
                System.out.println("2. View Artists");
                System.out.println("3. Update Artist");
                System.out.println("4. Delete Artist");
                System.out.println("5. Search Artist");
                System.out.println("6. View Albums");
                System.out.println("7. View Concerts");
                System.out.println("8. View Contracts");
                System.out.println("9. Exit");
                System.out.println("10. Show Our Artists on Database");
                System.out.println("11. Show Artists using ORM (Hibernate)");                
                System.out.print("Choose the number between 1 to 11: ");

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
                        System.out.print("Add debut year              : ");
                        int debut = sc.nextInt(); sc.nextLine();
                        System.out.print("Add label                   : ");
                        String label = sc.nextLine();
                        System.out.print("Add manager                 : ");
                        String manager = sc.nextLine();
                        System.out.print("Is it a band? (y/n): ");
                        String type = sc.nextLine();

                        if (type.equalsIgnoreCase("y")) {
                            ArrayList<String> members = new ArrayList<>();
                            System.out.print("How many members? ");
                            int count = sc.nextInt(); sc.nextLine();
                            for (int i = 0; i < count; i++) {
                                System.out.print("Member " + (i + 1) + ": ");
                                members.add(sc.nextLine());
                            }
                            Band band = new Band(name, genre, country, debut, label, manager, members);
                            artistService.addArtist(band);
                        } else {
                            System.out.print("Nickname: ");
                            String nickname = sc.nextLine();
                            SoloArtist solo = new SoloArtist(name, genre, country, debut, label, manager, nickname);
                            artistService.addArtist(solo);
                        }
                        break;

                    case 2:
                        artistService.viewArtists();
                        break;

                    case 3:
                        try {
                            System.out.print("Insert the number of the artist you want to update: ");
                            int idxU = sc.nextInt() - 1;
                            sc.nextLine();
                            System.out.print("New name: ");
                            String newName = sc.nextLine();
                            System.out.print("New genre: ");
                            String newGenre = sc.nextLine();
                            System.out.print("New country: ");
                            String newCountry = sc.nextLine();
                            artistService.updateArtist(idxU, newName, newGenre, newCountry);
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
                            artistService.deleteArtist(idxD);
                        } catch (Exception e) {
                            System.out.println("Enter the right number, please!");
                            sc.nextLine();
                        }
                        break;

                    case 5:
                        System.out.print("Enter keyword to search: ");
                        String keyword = sc.nextLine();
                        artistService.searchArtist(keyword);
                        break;

                    case 6:
                        albumService.viewAlbums();
                        break;

                    case 7:
                        concertService.viewConcerts();
                        break;

                    case 8:
                        contractService.viewContracts();
                        break;

                    case 9:
                        running = false;
                        System.out.println("Bye!");
                        break;
                    
                    case 10:
                        ArtistViewer.showArtists();
                        break;
                        
                     case 11:
                        ArtistORMService.viewAll();
                        break;
                        
                    default:
                        System.out.println("Enter the right thing, please!");
                }
            }
        }
    }
}
