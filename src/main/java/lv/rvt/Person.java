package lv.rvt;

public class Person {
    public String name;
    public String adress;

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String toString() {
        return name + "\n" + adress;
    }

    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
    }
}
