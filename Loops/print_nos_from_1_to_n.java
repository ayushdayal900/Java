package Loops;
import java.util.*;
//package Loops;

public class print_nos_from_1_to_n {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int range=sc.nextInt();
        int counter = 1;

            System.out.print("The numbers from 1 to n are : ");
            while (range>=counter) {
                System.out.print(counter + " ");
                counter++;                
            }


    }
    
}
