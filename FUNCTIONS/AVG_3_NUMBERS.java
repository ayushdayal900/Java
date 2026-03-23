import java.util.*;

public class AVG_3_NUMBERS {
    public static float averg(int a, int b, int c){

        return (float)((a+b+c)/3);

    }
    public static void main(String[] args) {

        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 3 numbers.");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        float avg = averg(num1,num2,num3);  
        System.out.println("Average of 3 numbers : " + avg);

    }
    
}
