package Loops;
import java.util.*;

public class FACTORIAL {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        
        if(num==0)
        {System.out.println("Factorial : 1");}

        else if(num<0)
        {System.out.println("Factorial not define");}

        else{
            for(int i=1; i<=num; i++)
        {
            fact=fact*i;
        }
            System.out.println("Factorial : " + fact);
        }



            }
    
}
