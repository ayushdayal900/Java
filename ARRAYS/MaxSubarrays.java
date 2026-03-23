package ARRAYS;

//import Loops.print_nos_from_1_to_n;

public class MaxSubarrays {

    public static void maxSubArrays(int aray[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < aray.length; i++) {
            int start = i;
            for (int j = i; j < aray.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += aray[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("max sum = " + maxSum);
        }

    public static void main(String[] args) {
        int numbers[] = { 0, 4, -1, 8, -1 };
        maxSubArrays(numbers);

    }
}
