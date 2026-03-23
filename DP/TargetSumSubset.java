package DP;

public class TargetSumSubset {

    // O(n * sum)
    public static boolean targetSum(int[] arr, int sum){

        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        // Initialization
        // If sum = 0 → always true (empty subset)
        for(int i = 0; i <= n; i++){
            dp[i][0] = true;
        }

        // If no elements and sum > 0 → false
        for(int j = 1; j <= sum; j++){
            dp[0][j] = false;
        }

        // Fill DP table
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sum; j++){

                int value = arr[i-1];

                // Include
                if(value <= j && dp[i-1][j - value]){
                    dp[i][j] = true;
                }
                // Exclude
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];
    }

    public static boolean targetSumPractice(int[] vals, int sum){

        // create 2d dp array
        int n = vals.length;
        int m = sum;
        boolean[][] dp = new boolean[n+1][m+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] = true;
        }

        // tabulation
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){

                int v = vals[i-1];
                // valid
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][m];

    }




    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int sum = 100;

        // System.out.println(targetSum(arr, sum)); // true
        System.out.println(targetSumPractice(arr, sum)); // true
    }
}
