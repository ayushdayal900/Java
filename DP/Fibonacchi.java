package DP;

public class Fibonacchi {

    public static int fib_memo(int n, int[] store){
        if(n ==0 || n==1){
            return n;
        }

        if(store[n] != 0){
            return store[n];
        }

        store[n] = fib_memo(n-1, store) + fib_memo(n-2, store);
        return store[n];
    }


    public static int fib_itr(int n, int[] dp){

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

    }

    public static void main(String[] args) {
        

        int n = 6;
        int[] arr = new int[n+1];
        // System.out.println(fib_memo(n, arr));
        System.out.println(fib_itr(n, arr));

    }
}
