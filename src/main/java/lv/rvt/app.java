package lv.rvt;

public class app {
    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.cred());
        ollie.study();
        System.out.println("Study credits "+ ollie.cred());
    }
}
