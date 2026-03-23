import java.util.*;

public class FUNCTION_OVERLOADING {

    public static int sum (int a, int b){
    int addition=a+b;
        return addition;
}

     public static int sum (int a, int b, int c){
    int addition=a+b+c;
        return addition;
}

 public static int sum (int a, int b, int c, int d){
    int addition=a+b+c+d;
        return addition;
}

 public static int mul (int a, int b){
    int multiplication=a*b;
        return multiplication;
}

public static float mul (float a, float b){
    float multiplication=a*b;
        return multiplication;
}

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int num1=sc.nextInt();
            int num2=sc.nextInt();

// by no of parameters

            int add1=sum(num1,num2);
            System.out.println("add1 : "+add1);

            int add2=sum(num1,num2,1);
            System.out.println("add2 : "+add2);

            int add3=sum(num1,num2,1,2);
            System.out.println("add3 : "+add3);

// by datatypes            

             
            System.out.println(mul(1,4));
            System.out.println(mul(2.11f,2.11f));
        }
    
}