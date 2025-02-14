package lv.rvt;

import java.util.List;
import java.util.ArrayList;


public class Box implements Packable {
    private double capacity;
    private List<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity; 
        this.items = new ArrayList<>();  
     } 

     public void add(Packable item) {
        if (this.weight() + item.weight() <= capacity) {
            items.add(item);
        }
     }
     
     public double weight() {
        double totalWeight = 0;
        for (Packable item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
     }

     @Override 
     public String toString() {
        return "Box: " + items.size() + " items, total weight" + weight() + " kg";
     }
}
