// largestand smallest number in array

package ARRAYS;

public class LargestNumInArray {

    public static int[] bigNum(int a[]) {
        int maxNum = a[0]; // - INFINITY  Integer.MIN_VALUE
        int minNum = a[0]; // + INFINITY  Integer.MAX_VALUE
        /// make minimum

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxNum) {
                maxNum = a[i];
            }
            if (a[i] < minNum) {
                minNum = a[i];
            }
        }
        int ansArray[]={maxNum,minNum};
        return ansArray;
    }

    public static void main(String[] args) {

        int aray[] = { 1, 20, 43, 34, 26 };
        int Numbers[] = bigNum(aray);
        System.out.println("Largest number in array is  : " + Numbers[0]);
        System.out.println("Smallest number in array is : " + Numbers[1]);
    }
}
