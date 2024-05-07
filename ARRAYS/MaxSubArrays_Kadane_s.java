
// maximum sum of an subarray b kadane's method
package ARRAYS;

public class MaxSubArrays_Kadane_s{

    public static void Kadane_s(int a[]){

        int currSum=0;
        int c=0;
        int maxSum =Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++){

            currSum=currSum+a[i];

                if(currSum<0){  currSum=0;  }
                if(maxSum<currSum){    
                    maxSum=currSum;  // maxSum= Math.max(currSum, maxSum );
                  }

        }
        System.out.println("max sum : "+ maxSum);

    }
    public static void main(String[] args) {

        int aray[]={-1,-4,8,9,-10};
        Kadane_s(aray);
        
    }
}