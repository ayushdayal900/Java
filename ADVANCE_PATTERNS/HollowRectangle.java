// to draw hollow rectangle 

package ADVANCE_PATTERNS;

import java.util.*;

public class HollowRectangle {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int numRows=sc.nextInt();
        int numCols=sc.nextInt();

        // outer loop
        for(int i=1; i<=numRows; i++){
            // inner loop
            for(int j=1; j<=numCols; j++){
                // if i=1 or 4 or if j=1 or 4 print *
                // numRows = 4 = colRows
                if(i==1 || i==numRows || j==1 || numCols==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }
    
}