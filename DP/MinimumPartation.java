

public class MinimumPartation {

    public static int minPartition(int[] nums){

        int sum = 0;
        for(int i: nums){
            sum += i;
        }

        int W = sum/2;
        int n = nums.length;

        int[][] dp = new int[n+1][W+1];

        for(int i=1; i<n+1; i++){
            for(int j=1; j<=W; j++){

                // valid
                if(nums[i-1] <= j){
                    // include & exclude
                    dp[i][j] = Math.max(nums[i-1] + dp[i-1][j-nums[i-1]], dp[i-1][j]);
                }else{//exclude
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);

    }

    public static int minPartitionPractice(int[] nums){

        int sum = 0;
        for(int i: nums){
            sum += i;
        }

        int sum1 = 0;
        int sum2 = 0;

        int W = sum/2;
        int n = nums.length;

        int[][] dp = new int[n+1][W+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }
        
        for()



    }

    public static void main(String[] args) {
        
        int[] nums = {1,6,11,5};
        // int ans = minPartition(nums);
        int ans = minPartitionPractice(nums);
        System.out.println(ans);


    }
}
