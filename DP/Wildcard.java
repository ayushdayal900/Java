package DP;

public class Wildcard {

    public static boolean wildcard(String s, String p){

        int n = s.length();
        int m = p.length();

        boolean[][] dp = new boolean[n+1][m+1];

        // initialization
        dp[0][0] = true;

        // length of pattern is 0
        for(int i=1; i<n+1; i++){
            dp[i][0] = false;
        }

        // length of string is 0
        for(int i=1; i<m+1; i++){
            if(p.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i-1];
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){

                // last char matches 
                    // 1. s[ch] == p[ch]
                    // 2. s[ch] == '?'
                
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    // matches for curr chars but does it matches for last char or pattern is ?
                    dp[i][j] = dp[i-1][j-1];
                }

                // last char of pattern is *
                    // 1. ignore: dp[i][j] = dp[i][j-1]
                    // 2. case: dp[i][j] = dp[i-1][j]
                else if(p.charAt(j-1) == '*'){
                    boolean ignore = dp[i][j-1];
                    boolean case1  = dp[i-1][j];
                    dp[i][j] = ignore || case1;
                }

                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }

    
    public static void main(String[] args) {
        
        String s = "baaabab";
        String p = "******ba******ab";
        boolean ans = wildcard(s, p);
        System.out.println(ans);

    }
}
