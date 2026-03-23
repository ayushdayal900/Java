import java.util.*;

public class PRIME_NO {

    public static void primeRange(int a){
        System.out.println("Prime numbers up to "+a);
        for(int i=2; i<=a; i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }

        }
    }


    public static boolean isPrime(int n1){
        boolean tag=true;

        for(int i=2; i<=Math.sqrt(n1); i++){
        //for(int i=2; i<n1-1; i++){
            if(n1%i==0){
                tag=false;
                break;
            }
           
        }
         return tag;
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a number to check it prime or not : ");
        int num=sc.nextInt();
        System.out.println(isPrime(num));

        System.out.print("Enter range of Prime Numbers : ");
        int range=sc.nextInt();
        primeRange(range);

        



    }
    
}
