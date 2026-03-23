package Loops;

import java.util.*;

public class avoid_10s_multiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your no : ");
            int number = sc.nextInt();

            if (number % 10 == 0) {
                continue;
            }

            System.out.println("Showing number : " + number);
        } while (true);
    }
}
