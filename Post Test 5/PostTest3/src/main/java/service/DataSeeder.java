package service;

import java.util.ArrayList;
import model.*;

public class DataSeeder {
    public static void seed(ArtistService artistService, AlbumService albumService,
                            ConcertService concertService, ContractService contractService) {
        
        // --- Artists
        ArrayList<String> members5SOS = new ArrayList<>();
        members5SOS.add("Luke Hemmings");
        members5SOS.add("Calum Hood");
        members5SOS.add("Michael Clifford");
        members5SOS.add("Ashton Irwin");

        Band band1 = new Band("5 Seconds of Summer", "Pop Rock", "Australia",
                2011, "Capitol Records", "Adam Wilkinson", members5SOS);

        SoloArtist solo1 = new SoloArtist("Taylor Swift", "Pop", "USA",
                2006, "Republic Records", "Tree Paine", "TayTay");

        artistService.addArtist(band1);
        artistService.addArtist(solo1);

        // --- Albums
        ArrayList<String> tracklist1 = new ArrayList<>();
        tracklist1.add("She Looks So Perfect");
        tracklist1.add("Amnesia");
        Album album1 = new Album("5 Seconds of Summer", 2014, band1, tracklist1);

        ArrayList<String> tracklist2 = new ArrayList<>();
        tracklist2.add("Love Story");
        tracklist2.add("You Belong With Me");
        Album album2 = new Album("Fearless", 2008, solo1, tracklist2);

        albumService.addAlbum(album1);
        albumService.addAlbum(album2);

        // --- Concerts
        ArrayList<ArtistAbstract> lineup1 = new ArrayList<>();
        lineup1.add(band1);

        ArrayList<ArtistAbstract> lineup2 = new ArrayList<>();
        lineup2.add(solo1);

        Concert concert1 = new Concert("Rock Out With Your Socks Out Tour", "Sydney", "2015", lineup1);
        Concert concert2 = new Concert("Fearless Tour", "Nashville", "2009", lineup2);

        concertService.addConcert(concert1);
        concertService.addConcert(concert2);

        // --- Contracts
        Contract contract1 = new Contract(band1, "Capitol Records", "2011-2020");
        Contract contract2 = new Contract(solo1, "Republic Records", "2018-2025");

        contractService.addContract(contract1);
        contractService.addContract(contract2);
    }
}
