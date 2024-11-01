package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
        
        }
        if (count > 0){
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        }
    }
}