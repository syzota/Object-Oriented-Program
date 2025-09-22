/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Asus GK
 */

import java.util.ArrayList;
import model.*;

public class DataSeeder {
    public static void seed(
        ArtistService artistService, 
        AlbumService albumService, 
        ConcertService concertService, 
        ContractService contractService
    ) {
        // ==========================
        // 1. 5 Seconds of Summer
        // ==========================
        ArrayList<String> members5SOS = new ArrayList<>();
        members5SOS.add("Luke Hemmings");
        members5SOS.add("Calum Hood");
        members5SOS.add("Michael Clifford");
        members5SOS.add("Ashton Irwin");

        Band fiveSOS = new Band("5 Seconds of Summer", "Pop Rock", "Australia", 2011, 
                "Capitol Records", "Jonathan Daniel", members5SOS);
        artistService.addArtist(fiveSOS);

        ArrayList<String> track5SOS = new ArrayList<>();
        track5SOS.add("She Looks So Perfect");
        track5SOS.add("Amnesia");
        track5SOS.add("Youngblood");
        Album album5SOS = new Album("5 Seconds of Summer", 2014, fiveSOS, track5SOS);
        albumService.addAlbum(album5SOS);

        ArrayList<Artist> lineup5SOS = new ArrayList<>();
        lineup5SOS.add(fiveSOS);
        Concert concert5SOS = new Concert("Rock Out With Your Socks Out Tour", "Sydney", "2015", lineup5SOS);
        concertService.addConcert(concert5SOS);

        Contract contract5SOS = new Contract(fiveSOS, "Capitol Records", 2013, 2020);
        contractService.addContract(contract5SOS);

        // ==========================
        // 2. One Direction
        // ==========================
        ArrayList<String> members1D = new ArrayList<>();
        members1D.add("Harry Styles");
        members1D.add("Liam Payne");
        members1D.add("Louis Tomlinson");
        members1D.add("Niall Horan");
        members1D.add("Zayn Malik");

        Band oneD = new Band("One Direction", "Pop", "UK", 2010, 
                "Syco Records", "Simon Cowell", members1D);
        artistService.addArtist(oneD);

        ArrayList<String> track1D = new ArrayList<>();
        track1D.add("What Makes You Beautiful");
        track1D.add("Story of My Life");
        track1D.add("Drag Me Down");
        Album album1D = new Album("Take Me Home", 2012, oneD, track1D);
        albumService.addAlbum(album1D);

        ArrayList<Artist> lineup1D = new ArrayList<>();
        lineup1D.add(oneD);
        Concert concert1D = new Concert("Where We Are Tour", "London", "2014", lineup1D);
        concertService.addConcert(concert1D);

        Contract contract1D = new Contract(oneD, "Syco Records", 2010, 2016);
        contractService.addContract(contract1D);

        // ==========================
        // 3. Taylor Swift
        // ==========================
        SoloArtist taylor = new SoloArtist("Taylor Swift", "Pop / Country", "USA", 2006, 
                "Republic Records", "Tree Paine", "TayTay");
        artistService.addArtist(taylor);

        ArrayList<String> trackTaylor = new ArrayList<>();
        trackTaylor.add("Love Story");
        trackTaylor.add("Blank Space");
        trackTaylor.add("Anti-Hero");
        Album albumTaylor = new Album("1989", 2014, taylor, trackTaylor);
        albumService.addAlbum(albumTaylor);

        ArrayList<Artist> lineupTaylor = new ArrayList<>();
        lineupTaylor.add(taylor);
        Concert concertTaylor = new Concert("The Eras Tour", "USA", "2023", lineupTaylor);
        concertService.addConcert(concertTaylor);

        Contract contractTaylor = new Contract(taylor, "Republic Records", 2018, 2028);
        contractService.addContract(contractTaylor);

        // ==========================
        // 4. Olivia Rodrigo
        // ==========================
        SoloArtist olivia = new SoloArtist("Olivia Rodrigo", "Pop", "USA", 2020, 
                "Geffen Records", "Alejandro Reyes", "Liv");
        artistService.addArtist(olivia);

        ArrayList<String> trackOlivia = new ArrayList<>();
        trackOlivia.add("Drivers License");
        trackOlivia.add("Good 4 U");
        trackOlivia.add("Vampire");
        Album albumOlivia = new Album("SOUR", 2021, olivia, trackOlivia);
        albumService.addAlbum(albumOlivia);

        ArrayList<Artist> lineupOlivia = new ArrayList<>();
        lineupOlivia.add(olivia);
        Concert concertOlivia = new Concert("SOUR Tour", "Los Angeles", "2022", lineupOlivia);
        concertService.addConcert(concertOlivia);

        Contract contractOlivia = new Contract(olivia, "Geffen Records", 2020, 2030);
        contractService.addContract(contractOlivia);

        SoloArtist sabrina = new SoloArtist("Sabrina Carpenter", "Pop", "USA", 2014, 
                "Island Records", "Robert Gibbs", "Sabs");
        artistService.addArtist(sabrina);

        ArrayList<String> trackSabrina = new ArrayList<>();
        trackSabrina.add("Nonsense");
        trackSabrina.add("Espresso");
        trackSabrina.add("Feather");
        Album albumSabrina = new Album("Emails I Can’t Send", 2022, sabrina, trackSabrina);
        albumService.addAlbum(albumSabrina);

        ArrayList<Artist> lineupSabrina = new ArrayList<>();
        lineupSabrina.add(sabrina);
        Concert concertSabrina = new Concert("Emails I Can’t Send Tour", "USA", "2023", lineupSabrina);
        concertService.addConcert(concertSabrina);

        Contract contractSabrina = new Contract(sabrina, "Island Records", 2021, 2030);
        contractService.addContract(contractSabrina);


        ArrayList<String> membersSlank = new ArrayList<>();
        membersSlank.add("Kaka");
        membersSlank.add("Bimbim");
        membersSlank.add("Abdee Negara");
        membersSlank.add("Ivanka");

        Band slank = new Band("Slank", "Rock", "Indonesia", 1983, 
                "Pro Sound", "Bimbim", membersSlank);
        artistService.addArtist(slank);

        ArrayList<String> trackSlank = new ArrayList<>();
        trackSlank.add("Terlalu Manis");
        trackSlank.add("Ku Tak Bisa");
        trackSlank.add("Virus");
        Album albumSlank = new Album("Generasi Biru", 1994, slank, trackSlank);
        albumService.addAlbum(albumSlank);

        ArrayList<Artist> lineupSlank = new ArrayList<>();
        lineupSlank.add(slank);
        Concert concertSlank = new Concert("Slank in Concert", "Jakarta", "2005", lineupSlank);
        concertService.addConcert(concertSlank);

        Contract contractSlank = new Contract(slank, "Pro Sound", 1990, 2020);
        contractService.addContract(contractSlank);


        SoloArtist bleachers = new SoloArtist("Bleachers", "Indie Pop", "USA", 2014, 
                "RCA Records", "Jack Antonoff", "Bleachers");
        artistService.addArtist(bleachers);

        ArrayList<String> trackBleachers = new ArrayList<>();
        trackBleachers.add("I Wanna Get Better");
        trackBleachers.add("Rollercoaster");
        trackBleachers.add("Don't Take The Money");
        Album albumBleachers = new Album("Strange Desire", 2014, bleachers, trackBleachers);
        albumService.addAlbum(albumBleachers);

        ArrayList<Artist> lineupBleachers = new ArrayList<>();
        lineupBleachers.add(bleachers);
        Concert concertBleachers = new Concert("Gone Now Era Tour", "USA", "2017", lineupBleachers);
        concertService.addConcert(concertBleachers);

        Contract contractBleachers = new Contract(bleachers, "RCA Records", 2014, 2025);
        contractService.addContract(contractBleachers);

    }
}

