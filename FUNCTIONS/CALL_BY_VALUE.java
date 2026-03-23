import java.util.*;

public class CALL_BY_VALUE {

    public static void chage_num1(int a) {
        a = 10;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("num1 : " + a + "........num2 : " + b + ".........Swapping Occur");
    }

    public static int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int factorial(int a){

        if (a<=0) {return 1;}

        int ft=1;
        for(int i=1; i<=a; i++){
            ft=ft*i;
        }
        return ft;
    }

    public static int binoCoeff(int a, int b){
        int n1=factorial(a);
        int n2=factorial(b);
        int n3=factorial(a-b);

        int ans=n1/(n2*n3);
        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println();

        chage_num1(num1);
        System.out.println("num1 (no chage expected in num1) : " + num1); // call by value (no change)

        swap(num1, num2);

        int multi = multiply(num1, num2);
        System.out.println("num1 * num2 : " + multi);

        int fact=factorial(num1);
        System.out.println("Factorial of num1 : "+fact);

        int BC=binoCoeff(num1,  num2);
        System.out.println("Binomial Coefficent of num1 & num2 is : "+ BC);

    }

}
