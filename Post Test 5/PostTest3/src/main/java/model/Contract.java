package model;

public class Contract {
    private ArtistAbstract artist;
    private String label;
    private String period;

    public Contract(ArtistAbstract artist, String label, String period) {
        this.artist = artist;
        this.label = label;
        this.period = period;
    }

    public void displayContract() {
        System.out.println("Artist  : " + artist.getName());
        System.out.println("Label   : " + label);
        System.out.println("Period  : " + period);
        System.out.println("===========================");
    }
}
