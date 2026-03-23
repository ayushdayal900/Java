package DP;

public class KnapsackTab {

    public static int knapsack(int[] val, int[] wt, int W){
        
        int n = val.length ;
        int[][] dp = new int[n+1][W+1];
        
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }

        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){

                int v = val[i-1];
                int w = wt[i-1];

                // valid
                if(w <= j){
                    // include
                    int incProfit = v + dp[i-1][j-w];
                    // exclude
                    int excProfit = dp[i-1][j];
                    
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else{
                    // exclude
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        
        return dp[n][W];
    }

    public static int unboundedKnapsac(int[] vals, int[] wt, int W, int n){

        int m = W;

        int[][] dp = new int[n+1][m+1];

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){

                int v = vals[i-1];
                int w = wt[i-1];

                // valid
                if(w <= j){
                    int ans1 = dp[i-1][j];
                    int ans2 = v + dp[i][j-w];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][m];


    }


    public static void main(String[] args) {

        int[] val = {15, 14, 10, 45, 30};
        int[] wt  = {2,5,1,3,4};
        int W = 7;

        System.out.println(knapsack(val, wt,W));

        System.out.println(unboundedKnapsac(val, wt, W, val.length));
    }
}
