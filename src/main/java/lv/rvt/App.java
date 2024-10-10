package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    
    int sk = scanner.nextInt();
    int faktorials = 1;
    for (int i = 1;i <= sk; ++i ) {
    
        faktorials *= i;
        System.out.println(faktorials);
    }
}
}
