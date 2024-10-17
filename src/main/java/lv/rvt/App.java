package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
    DivisibleByThreeInRange(2, 40);

    }
    public static void DivisibleByThreeInRange(int viens , int divi) {
      
    for (int i = viens; i <= divi; i++){
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
        


}
