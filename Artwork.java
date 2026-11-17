public class Artwork {

    String name;
    String artist;
    int year;

    public Artwork(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public static void main(String[] args) {
        Artwork MonaLisa = new Artwork("Mona Lisa", "Leonardo da Vinci", 1503);
        Artwork TheRaftOfTheMedusa = new Artwork("The Raft of the Medusa", "Théodore Géricault", 1818);
        System.out.println("The name of our second artwork is " + TheRaftOfTheMedusa.name + "! Created by "
                + TheRaftOfTheMedusa.artist + ", the work was made in the year " + TheRaftOfTheMedusa.year
                + ". How cool!");

    }
}
