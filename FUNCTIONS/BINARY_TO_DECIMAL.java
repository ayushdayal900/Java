import java.util.*;

public class BINARY_TO_DECIMAL {

    public static void binaryToDecimal(int binNum) {
        int pow = 0;
        int myNum = binNum;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) (Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println(myNum + "  in Decimal Form is : " + decNum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int num = sc.nextInt();

        binaryToDecimal(num);

    }
}
