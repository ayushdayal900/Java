
//to draw hollow rhombus
package ADVANCE_PATTERNS;
import java.util.*;



public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rowNum=sc.nextInt();
        
        for(int i=1; i<=rowNum; i++){
            // spaces
            for(int j=1; j<=(rowNum-i); j++){
                System.out.print(" ");
            }

            // Hollow Rectangle
            for(int k=1; k<=rowNum; k++){
                if(i==1 || i==rowNum || k==1 || k==rowNum){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println();
        }
                // System.out.println();
    }
}
