package DP;

public class ClimbingStairs {

    public static int steps(int n, int[] dp){
        if(n ==0 || n==1){
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = steps(n-1, dp) + steps(n-2,dp);
        return dp[n];
    }


    // for 3 jumps

    public static int steps_3(int n, int[] dp){
        if(n ==0 || n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = steps_3(n-1, dp) + steps_3(n-2,dp) + steps_3(n-3, dp);
        return dp[n];
    }


    public static int steps_tabular(int n, int[] dp){
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        
        int n = 6;
        int[] dp = new int[n+1];
        // System.out.println(steps(n, dp));
        System.out.println(steps_3(n, dp));
        // System.out.println(steps_tabular(n, dp));


    }
}
