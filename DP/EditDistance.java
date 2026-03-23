package DP;

public class EditDistance {

    public static int editDistanceTab(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];

        // initialization
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){

                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i; 
                }
            }
        }

        // bottom up
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){

                // same
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = dp[i][j-1] + 1;
                    int delete = dp[i-1][j] + 1;
                    int replace = dp[i-1][j-1] + 1;

                    dp[i][j] = Math.min(add, Math.min(delete, replace));
                }
            }
        }

        return dp[n][m];

    }

    public static int editDistanceMemo(String s1, String s2, int n, int m){

        if(n==0){   return m;}
        if(m==0){   return n;}

        // perform ops
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return editDistanceMemo(s1, s2, n-1, m-1);
        }
        else{

            // add 
            int ans1 = editDistanceMemo(s1, s2, n, m-1) + 1;

            // delete
            int ans2 = editDistanceMemo(s1, s2, n-1, m) + 1; 

            // replace
            int ans3 = editDistanceMemo(s1, s2, n-1, m-1) + 1;

            return Math.min(Math.min(ans1, ans2), ans3);
        }
    }

    public static void main(String[] args) {
        
        String word1 = "intention";
        String word2 = "execution";
        // int ans = editDistanceTab(word1, word2);
        // int ans = editDistanceMemo(word1, word2, word1.length(), word2.length());
        // System.out.println(ans);

    }
}
