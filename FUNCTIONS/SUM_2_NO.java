import java.util.*;

/**
 * SUM_2_NO
 */
public class SUM_2_NO {

    public static int sum_of_2_numbers(int a, int b) { // parameters or actual parameters

        int sum = a+b;
        return sum;        
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for addition.");

        System.out.print("number 1: ");
        int num1 = sc.nextInt();

        System.out.print("number 2: ");
        int num2 = sc.nextInt();

        int ans = sum_of_2_numbers(num1,num2); //arguments or actual parameters
        System.out.println("Sum of two number is : " + ans);

        }
}