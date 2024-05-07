package clg.FDS_ASSIGN;
// import java.util.Arrays;

public class Assignment_01 {
    
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 1, 1};
        findMissingAndRepeating(nums);
    }
    
    public static void findMissingAndRepeating(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        
        int missing = 0, repeating = 0;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeating = i;
            }
        }
        
        System.out.println("Missing number: " + missing);
        System.out.println("Repeating number: " + repeating);
    }
}
