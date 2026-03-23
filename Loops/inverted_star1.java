package Loops;

import java.util.*;

public class inverted_star1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int line = 1; line <=num; line++) {
            for(int star=1; star<=num-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}