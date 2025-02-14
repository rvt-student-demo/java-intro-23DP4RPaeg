package lv.rvt;
public class Book implements Packable {
    public String author;
    public String title; 
    public double weight;

    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    public double weight() { 
        return this.weight;
    }

    @Override 
    public String toString() { 
        return this.author + ": " + this.title;    
    }
}
