package DP;

import java.util.Arrays;

public class Knapsack {

    public static int knapsack(int[] val, int[] wt, int W, int n, int[][] dp){
        if(W==0 || n==0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){
            // include
            int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1, dp);
            // exclude
            int ans2 = knapsack(val, wt, W, n-1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }else{
            // exclude
            dp[n][W] = knapsack(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }


    public static int knapsackPractice(int[] val, int[] wt, int W, int n, int[][] dp){

        // base case
        if(W==0 || n==0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[W][n];
        }

        // valid
        if(wt[n-1] <= W){
            // include
            int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1, dp);
            // exclude
            int ans2 = knapsack(val, wt, W, n-1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }
        // invalid
        else{
            dp[n][W] = knapsack(val, wt, W, n-1, dp);
        }

        return dp[n][W];
    }


    public static int knapsackTab(int[] val, int[] wt, int W, int n, int[][] dp){

        // initialization
        for(int i=0; i<n+1; i++){
            dp[0][i] = 0;
        }
        for(int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }

        // i = no of items
        // j = weight allowed

        for(int i=1; i<n+1; i++){
            for(int j = 1; j<W+1; j++){

                int currWt = wt[i-1];

                if(currWt <= j){
                    // include
                    int ans1 = val[i-1]+dp[i-1][j-currWt];
                    // exclude
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    dp[i][j] = dp[i-1][j];
                }

            }
        }

        return dp[n][W];

    }


    public static void main(String[] args) {
        
        int[] val = {15, 14, 10, 45, 30};
        int[] wt  = {2,5,1,3,4};
        int W = 7;

        int[][] dp = new int[wt.length + 1][W+1];
        // Arrays.fill(dp, -1);
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        // System.out.println("Maxm Profit is: "+ knapsack(val, wt, W, val.length, dp));

        int n = val.length;
        // int[][] dp = new int[n+1][W+1];
        
        // for(int i=0; i<dp.length; i++){
        //     for(int j=0; j<dp[0].length; j++){
        //         dp[i][j] = -1;
        //     }
        // }  

        // System.out.println(knapsackPractice(val, wt, W, n, dp));
        System.out.println(knapsackTab(val, wt, W, n, dp));




    }
}
