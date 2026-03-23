package Loops;

import java.util.*;
public class SEPERATE_SUM_OF_EVEN_ODD_NOS {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int evenSum=0;
       int oddSum = 0;

       for(int i=1; i<=10; i++)
       { 
        System.out.print("Enter 10 numbers : ");
        int num = sc.nextInt();
        if(num%2==0)
        {evenSum = evenSum+num;}
        else{ oddSum = oddSum+num;}
       }
       System.out.println("Sum of even numbers : " + evenSum);
       System.out.println("Sum of odd numbers : " + oddSum);


    }    
}
