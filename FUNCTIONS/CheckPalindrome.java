import java.util.*;

public class CheckPalindrome {

    public static int checkReverse(int a) {

        int lastDig = 0;
        int revNum = 0;

        while (a > 0) {
            // 1234 123 12
            lastDig = a % 10; // 4 3 2
            revNum = revNum * 10 + lastDig; // 40 + 3
            a = a / 10; // 123 12

        }

        return revNum;
    }

    public static boolean checkPalindrome(int a) {

        if (a == checkReverse(a)) {
            return true;
        }
        return false;
    }
    public static boolean checkPalindrome(String str) {
        // 1 2 3 2 1
        // 1 2 3 4 
        // 0 1
        int n=str.length();
        for (int i = 0; i < n/2; i++) {
            if ((str.charAt(i)!=str.charAt(n-i-1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        String number = sc.nextLine();
        // System.out.print(checkPalindrome(num));
        System.out.print(checkPalindrome(number));

    }

}