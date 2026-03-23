package DP;

public class LongestCommonSubsequence {

    public static int lcs(String s1, String s2, int n, int m){

        // base case
        if(n==0 || m==0){   return 0;   }

        // same char at end
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return lcs(s1, s2, n-1, m-1) + 1;
        }
        // diff char at end
        else{
            int ans1 = lcs(s1, s2, n-1, m);
            int ans2 = lcs(s1, s2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }


    public static int lcs_memo(String s1, String s2, int n, int m, int[][] dp){

        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = lcs_memo(s1, s2, n-1, m-1, dp) + 1;
            return lcs_memo(s1, s2, n-1, m-1, dp) + 1;
        }else{
            int ans1 = lcs_memo(s1, s2, n-1, m, dp);
            int ans2 = lcs_memo(s1, s2, n, m-1, dp);

            dp[n][m] = Math.max(ans1, ans2);
            return Math.max(ans1, ans2);
        }
    }

    public static int lcsTab(String s1, String s2, int n, int m){

        int[][] dp = new int[n+1][m+1];
        
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }



        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];

    }

    public static int lcsPractice(String s1, String s2, int n, int m, int[][] dp){

        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        // s1 and s2 last char same
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = lcsPractice(s1, s2, n-1, m-1, dp) + 1;
            return dp[n][m];

        }

        else{
            int ans1 = lcsPractice(s1, s2, n-1, m, dp);
            int ans2 = lcsPractice(s1, s2, n, m-1, dp);
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }

    }


    public static int lcsTabPractice(String s1, String s2, int n, int m, int[][] dp){

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                // valid
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j]  = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }

    public static int lcsMemoPractice(String s1, String s2, int n, int m, int[][] dp){

        // n==0 || m==0
        if(n==0 || m==0){
            return 0;
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = lcsMemoPractice(s1, s2, n-1, m-1, dp) + 1;
            return dp[n][m];
        }else{
            int ans1 = lcsMemoPractice(s1, s2, n, m-1, dp);
            int ans2 = lcsMemoPractice(s1, s2, n-1, m, dp);
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }
    }


    public static void main(String[] args) {
        
        String s1 = "abcdge";
        String s2 = "abedg";
        int n = s1.length();
        int m = s2.length();

        // // Ans: 4 (abdg)
        // int ans = lcs(s1, s2, n, m);
        // System.out.println(ans);

        // int[][] dp = new int[n+1][m+1];
        // // initialization
        // for(int i=0; i<n+1; i++){
        //     for(int j=0; j<m+1; j++){
        //         dp[i][j] = -1;
        //     }
        // }

        // ans = lcs_memo(s1, s2, n, m, dp);
        // System.out.println(ans);

        // ans = lcsTab(s1, s2, n, m);
        // System.out.println(ans);

        int[][] dp = new int[n+1][m+1];
        // for(int i=0; i<dp.length; i++){
        //     for(int j=0; j<dp[0].length; j++){
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(lcsPractice(s1, s2, n, m, dp));
        System.out.println(lcsTabPractice(s1, s2, n, m, dp));
        // System.out.println(lcsMemoPractice(s1, s2, n, m, dp));




    }
}
