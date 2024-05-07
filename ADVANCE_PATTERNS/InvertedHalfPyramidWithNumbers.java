// inverted half pyramid of numbers

package ADVANCE_PATTERNS;
import java.util.*;
/**
 * InvertedHalfPyramidWithNumbers
 */
public class InvertedHalfPyramidWithNumbers {

    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int rowNum=sc.nextInt();


        for(int i=1; i<=rowNum; i++){               // for(int i=; i<=rowNum; i++)
            for(int j=1; j<=rowNum-i+1; j++){       // for(int j=1; j<=rowNum-i; j++)
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

