// draw triangle of 0 and 1

package ADVANCE_PATTERNS;
import java.util.*;

public class TriangleOf01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rowNum=sc.nextInt();
        int counter =0;

        for(int i=0; i<=rowNum; i++){
            for(int j=0; j<=i; j++){
                counter=i+j;
                if(counter%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }

    }
}


