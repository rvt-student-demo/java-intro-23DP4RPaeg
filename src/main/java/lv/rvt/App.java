package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
    printstars(3);
    System.out.println();
    printsquare(4);
    System.out.println();
    printrectangle(17, 3);
    System.out.println();
    printTriangle(4);
}
    public static void printstars(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printsquare(int size) { 
       for (int i = 0; i < size; i++) {
            printstars(size);
        }
        System.out.println();
    }
   public static void printrectangle(int width, int height){
       for (int i = 0; i < height; i++){
            printstars(width);
       }
    }
    public static void printTriangle(int size){
        for (int i = 0; i <= size; i++){
            printstars(i);
        }
    }
}