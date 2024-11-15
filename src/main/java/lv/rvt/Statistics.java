package lv.rvt;

public class Statistics {
    private int count; 
    private int sum;

    public Statistics() {
    }
    
    public void addNumber(int number) { 
        this.count = this.count + 1;
        this.sum += number;
    }

    public int getCount() { 
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public int average() {
        int average = this.sum / this.count;
        return average;
    }
}
