package DP;

public class CountingTrees {

    public static int countingTrees(int n){

        int[] dp = new int[n+1];
        dp[0] = 1; dp[1] = 1;

        for(int i=2; i<n+1; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }

        return dp[n];


    }

    public static void main(String[] args) {
        
        int[] nodes = {1,2,3,4};
        int ans = countingTrees(nodes.length);
        System.out.println(ans);

    }
}
