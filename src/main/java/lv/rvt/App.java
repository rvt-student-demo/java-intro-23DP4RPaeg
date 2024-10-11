package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("How many times?");

    int reiz = Integer.valueOf(scanner.nextLine());
    int skaits = 0;
    
    while (reiz > skaits){
        printText();
        skaits ++;

        }
    }

public static void printText() {
    System.out.println("Aziet");
}
}
