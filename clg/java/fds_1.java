 package clg;
import java.util.*;

public class fds_1 {
 
    public static void main(String[] args) {
        
        // System.out.println("enter last natural number");
        // int num = sc.nextInt();
        
        // int arr[]=new int[num];
        // for(int i=0; i<arr.length; i++){
            //     arr[i]=i+1;
            // }
            
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,7,8,9,10};
        int sum=0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        int k=arr[arr.length-1];
        int total = (k*k+k)/2;
        int ans = total-sum;

        System.out.println(ans);

        //----------------------------------------------------------------------
        //repetation

        // int arr1[]={1,2,3,3,4,5};
        int k1=0;


        int mat[]=new int[5];

        System.out.println("enetr number in array : ");
        for(int i=0; i<mat.length; i++){
            mat[i]=sc.nextInt();
        }

        int counter =1;

        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat.length; j++){
                if(mat[i]==mat[j]){
                    k1 = mat[i];
                    counter++;
                }
            }
            if(counter>0){
                System.out.println(mat[i]+" repeats "+ counter +" times ");
                break;
            }
        }

        System.out.println("repeating number : "+k1);




    }
}
