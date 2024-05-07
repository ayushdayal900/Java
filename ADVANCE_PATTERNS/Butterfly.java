package ADVANCE_PATTERNS;

 // Q1. WRITE A PROGRAMM TO DRAW BUTTERFLY STRUCTURE.

// package ADVANCE_PATTERNS;
// import java.util.*;

// public class Butterfly {
//    public static void main(String[] args) {

//       Scanner sc = new Scanner(System.in);
//       int rowNum = sc.nextInt();

//       for (int i = 1; i <= rowNum; i++) {
//          // stars =i;
//          for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//          }

//          // spaces = 2*(n-i)
//          for (int j = 1; j <= 2 * (rowNum - i); j++) {
//             System.out.print(" ");
//          }

//          // stars = i
//          for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//          }
//          System.out.println();

//       }
//       // 2nd half

//       for (int i = rowNum; i >= 1; i--) {

//          // stars =i;
//          for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//          }

//          // spaces = 2*(n-i)
//          for (int j = 1; j <= 2 * (rowNum - i); j++) {
//             System.out.print(" ");
//          }

//          // stars = i
//          for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//          }
//          System.out.println();

//       }

//    }

//     //---------------------------------------------------
//     // main 2

// //    public static void main(String[] args) {

// //       Scanner sc= new Scanner(System.in);
// //       int rowNum = sc.nextInt();

// //       // 1st half part
// //       for(int i=0; i<rowNum; i++){
// //          //starting stars
// //          for(int j=0; j<i; j++){
// //             System.out.println("*");
// //          }
// //          //spaces
// //       }
      
// //    }

// }


import java.util.*;

// package ADVANCE_PATTERNS;

/**
 * Butterfly
 */
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