package lv.rvt;

public class Timer {
    private Timer hundredths;
    private Timer seconds;
    private Timer cap;

    public Timer() {
        this.hundredths = 0;
        this.seconds = 0;
        this.cap = 100;
    }

    public void advance() {
        this.hundredths.advance();

        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return hundredths + ":" + seconds;
    }
}