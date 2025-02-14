package lv.rvt;
public class CD implements Packable {
    public String artist;
    public String Name;
    public int year; 
    private final double weight = 0.1;

    public CD(String artist, String Name, int year) {
        this.artist = artist;
        this.Name = Name; 
        this.year = year;
    }

    public double weight() { 
        return this.weight;
    }

    @Override
    public String toString() {
         return this.artist + ": " + this.Name + " (" + this.year + ")";
    }
}
