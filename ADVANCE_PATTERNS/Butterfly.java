package ADVANCE_PATTERNS;

import java.util.*;

public class Butterfly {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int spaces=rows;
        for(int i=1; i<rows; i++){
            //*
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=0; j<2*(spaces-1); j++){
                System.out.print(" ");
            }
            spaces--;

            //*
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {

         // stars =i;
         for (int j = 1; j <= i; j++) {
         System.out.print("*");
         }

          // spaces = 2*(n-i)
             for (int j = 1; j <= 2 * (rows - i); j++) {
            System.out.print(" ");
      }

            // stars = i
            for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
            System.out.println();

  }

    }
}