
// maxm subarray 

package ARRAYS;
import java.util.*;



public class MaxSubarrays1 {

    public static void maxArray(int a[]){

        int preSum[]=new int [a.length];
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        preSum[0]=a[0];

            for(int i=1; i<a.length; i++){
                preSum[i]=preSum[i-1]+a[i];
            }

            for(int i=0; i<a.length; i++){
                int start=i;
                for(int j=i; j<a.length; j++){
                    int end=j;
                    currSum= start==0 ? preSum[end] : preSum[start]-preSum[start-1];

                    if (maxSum<currSum){
                        maxSum=currSum;
                    }
                }
            }

            System.out.println("max sum = "+maxSum);
    }

    public static void main(String[] args) {

        int aray[]={0,0,0,4,5};
        maxArray(aray);
        
    }    
}
