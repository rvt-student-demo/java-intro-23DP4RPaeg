package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Statistics statistics = new Statistics();

        Scanner reader = new Scanner(System.in);
        
        while (true) {
            int number = reader.nextInt();
            if (number == -1) {
                break;
            }
            statistics.addNumber(number);
        }

        System.out.println("Sum: "+statistics.sum());
    }
 }