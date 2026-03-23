import java.util.*;

public class CHECK_EVEN {

    public static boolean isEven(int a) {

        if (a % 2 != 0) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int num = sc.nextInt();
        System.out.println(isEven(num));

    }

}
