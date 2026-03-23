package Loops;
import java.util.*;

/**
 * print _reverse_of_no
 */
public class print_reverse_of_no {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastDigit =0;

        while(num>0)
        {
            lastDigit = num%10;
            System.out.print(lastDigit);
            num=num/10;
        }
        System.out.println();
    }

    
}