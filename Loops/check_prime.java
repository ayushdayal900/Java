package Loops;

import java.util.*;

public class check_prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        boolean flg = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && number != 1) {
                flg = false;
                break;
            }
        }
        if (number == 1 || number == 0) {
            System.out.println("Neither Prime Nor Composite ");
        }

        else {
            if (flg == true) {
                System.out.println("Prime no.");
            }

            else {
                System.out.println("Composite no.");
            }
        }

    }
}