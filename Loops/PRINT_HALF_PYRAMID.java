package Loops;
import java.util.*;

public class PRINT_HALF_PYRAMID {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        for(int line=1; line<=num; line++){
            for (int numb = 1; numb <=line; numb++) {
                System.out.print(numb);                
            }
            System.out.println();
        }

    }
}
