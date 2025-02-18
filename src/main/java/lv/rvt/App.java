package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
     BufferedReader reader = Helper.getReader("persons.csv");
    //String line1 = reader.readLine();
    //System.out.println(line1);
    System.out.println(reader.readLine());
    System.out.println(reader.readLine());
    System.out.println(reader.readLine());

    }
}
