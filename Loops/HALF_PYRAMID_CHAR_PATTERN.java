package Loops;

import java.util.*;

public class HALF_PYRAMID_CHAR_PATTERN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = 'A';

        for (int line = 1; line <= num; line++) {
            for (int chars = 1; chars <= line; chars++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }

}
