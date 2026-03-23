package DP;

import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        
        int[] arr1 = {50, 3, 10, 7, 40, 80};
        int n = arr1.length;

        HashSet<Integer> set = new HashSet<>();
        for(int i: arr1){
            set.add(i);
        }

        int[] arr2 = new int[set.size()];
        int k = 0;
        for(int num: set){
            arr2[k] = num;
            k++;
        }

        Arrays.sort(arr2);
        
        // dp - tabulation approach
        int m = arr2.length;
        int[][] dp = new int[n+1][m+1];

        // initialization
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }

        // tabulation
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){

                // same
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{// diff
                    int len1 = dp[i-1][j];
                    int len2 = dp[i][j-1];
                    dp[i][j] = Math.max(len1, len2);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
