package lv.rvt;


public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity; }
        else {
            this.capacity = 0; 
        }
        this.balance = 0;
        }

        public double getBalance() {
            return this.balance;
        }

        public double getCapacity() {
            return this.capacity;
        }
    
    public double HowMuchSpaceLeft() {
        return this.capacity - this.balance;
    }
}