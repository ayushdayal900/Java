package clg;
import java.util.*;

//-------------------------- assignment 01 -----------------

public class quad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter coeff for ax^2+bx+c=0");

        double  a = sc.nextInt();
        double  b = sc.nextInt();
        double  c = sc.nextInt();

        double x1=0;
        double x2=0;

        double D =(b*b - 4*a*c);

        if(D>=0){
            x1 = (-b+(Math.sqrt(D)))/2*a;
            x2 = (-b-(Math.sqrt(D)))/2*a;

            System.out.println("root 1 : "+x1);
            System.out.println("root 2 : "+x2);

        }

        else{
            System.out.println("complex roots can be obtaine");
        }

        
        
    }    
}
