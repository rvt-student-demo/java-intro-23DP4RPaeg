package lv.rvt;

public class Person {
    public String name;
    public String adress;

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return name + "\n" + adress;
    }
}
