package lv.rvt;

public class Teacher extends Person {
    private int Salary;

    public Teacher(String name, String adress, int Salary) {
        super(name, adress);
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "\t" + "salary " + Salary + "euro/month";
    }
}
