package DP;

public class LongestCommonSubstring {

    public static int longestCommonSubstring(String s1, String s2, int n, int m){

        int[][] dp = new int[n+1][m+1];
        int maxLen = 0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return maxLen;
    }



    public static void main(String[] args) {
        
        String s1 = "ABCDG";
        String s2 = "ABCDG";
        int n = s1.length();
        int m = s2.length();

        int ans = longestCommonSubstring(s1, s2, n, m);
        System.out.println(ans);


    }
}
