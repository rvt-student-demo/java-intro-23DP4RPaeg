package lv.rvt;

public class Student extends Person {
    private int StudyCred;

    public Student(String name, String adress) {
        super(name, adress);
        this.StudyCred = 0;
    }

    public void study() {
        this.StudyCred ++;
    }

    public int cred() {
        return this.StudyCred;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Study Credits " + cred();
    }

}
