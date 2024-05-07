// draw solid rhombus

package ADVANCE_PATTERNS;
import java.util.*;

public class SolidRhombus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rowNum=sc.nextInt();
     //   int spaces=0;

        for(int i=1; i<=rowNum; i++){
                for(int spaces=1; spaces<=(rowNum-i); spaces++){
                System.out.print(" ");
            }

            for(int stars=1; stars<=rowNum; stars++){
                System.out.print("*");
            }

            System.out.println();

        }


    }
}  



    

