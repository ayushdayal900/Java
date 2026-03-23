package DP;

public class MatrixChainMultiplication {

    
    public static int mcm(int[] arr, int i, int j){

        // base case
        if(i==j){
            // single matrix case
            return 0;
        }
        
        // partioning based on k
        int ans = Integer.MAX_VALUE;
        for(int k = i; k<=j-1; k++){
            int cost1 = mcm(arr, i, k);     //Ai....Ak      res = arr[i-1]xarr[k]
            int cost2 = mcm(arr, k+1, j);   //Ai+1.....Aj   res = arr[k]xarr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int total = cost1 + cost2 + cost3;
            ans = Math.min(total, ans);
        }
        
        // return minimum cost
        return ans;

    }


    public static int mcmMemo(int[] arr, int i, int j, int[][]dp){

        // base case
        if(i==j){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1 = mcmMemo(arr, i, k, dp);
            int cost2 = mcmMemo(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int total = cost1 + cost2 + cost3;
            ans = Math.min(ans, total);
        }
        dp[i][j] = ans;
        return dp[i][j];
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,3};
        int ans =0;
        // ans = mcm(arr, 1, arr.length-1);
        // System.out.println(ans);

        int n = arr.length;
        int[][] dp = new int[n][n];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp.length; j++){
                dp[i][j] = -1;
            }
        }

        ans = mcmMemo(arr, 1, arr.length-1, dp);
        System.out.println(ans);


    }
}
