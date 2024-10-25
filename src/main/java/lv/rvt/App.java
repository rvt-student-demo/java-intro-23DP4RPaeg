package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
    printTriangle(4);
}
    public static void printstars(int number){
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
    }
    
    public static void printSpaces(int number){
        for (int i = 0; i < number; i++){
            System.out.println("");
        }
    }
    
    public static void printTriangle(int size){
        for (int i = 0; i <= size; i++){
            printSpaces(size);
            printstars(i);
        }
    }

}
