

// to ptint diamond

package ADVANCE_PATTERNS;
import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rowNum=sc.nextInt();

        for(int i=0; i<=rowNum; i++){
            for(int spaces=1; spaces<=(rowNum-i); spaces++){
                System.out.print(" ");
            }
            for(int star=1; star<=2*i+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }


          for(int i=rowNum; i>=0; i--){
            for(int spaces=1; spaces<=(rowNum-i); spaces++){
                System.out.print(" ");
            }
            for(int star=1; star<=2*i+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}