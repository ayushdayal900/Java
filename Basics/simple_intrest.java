//Q. calculate simple interest

package Basics;
import java.util.*;
public class simple_intrest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("No of year(s) : ");
        int yer = sc.nextInt();

        System.out.print("Principal amount in lack(s): ");
        int amt = sc.nextInt();

        System.out.print("Rate of interest : ");
        int rate = sc.nextInt();
        
        System.out.print("Simple Interest : ");
        System.out.println(yer*amt*rate);
    }
    
}
