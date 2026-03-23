package ARRAYS;
import java.util.*;

//import Loops.for_100_times_hello_world;

public class ShareMarket {

    public static int profit(int a[]){

        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0; i<a.length; i++){
            if(buyPrice<a[i]){
                int profit=a[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=a[i];
            }
        }

        return maxProfit;
    }
    

    public static void main(String[] args) {
        System.out.println("Enter no of observations : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[]=new int[size];

        // array of selling price
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }

        System.out.println("Maximum profit : "+profit(array));
    }
}
