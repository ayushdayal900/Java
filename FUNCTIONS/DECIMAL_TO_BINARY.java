import java.util.*;

public class DECIMAL_TO_BINARY {

    public static void decimalToBinary(int decNum) {

        int binNum = 0;
        int pow = 0;
        int remainder = 100;

        while (decNum > 0) {
            remainder = decNum % 2; // remainder
            decNum = decNum / 2; // quotient
            binNum = binNum + (remainder * (int) Math.pow(10, pow));
            pow++;
        }

        System.out.println("Decimal To Binary : " + binNum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        int Num = sc.nextInt();
        decimalToBinary(Num);
    }

}
