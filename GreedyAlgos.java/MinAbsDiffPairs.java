import java.util.Arrays;

/**
 * MinAbsDiffPairs
 */
public class MinAbsDiffPairs {

    public static void main(String[] args) {
        int[] A1 = {1,2,3};
        int[] B1 = {2,1,3};
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int ans=0;

        for(int i=0; i<A.length; i++){
            ans += Math.abs(A[i]-B[i]);
        }
        System.out.println("Min abs diff of pairs : "+ans);
    }
}