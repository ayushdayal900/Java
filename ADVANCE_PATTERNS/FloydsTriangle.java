//to draw floyds triangle
package ADVANCE_PATTERNS;

import java.util.*;

public class FloydsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int counter =1;

        for(int i=1; i<=rowNum; i++){
            for(int j=1; j<=i;j++){
                System.out.print(" "+counter+" ");                
                counter ++;
            }
            System.out.println();
        }
        
    }

}
