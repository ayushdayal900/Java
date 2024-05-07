
// inverted half pyrmid

package ADVANCE_PATTERNS;

import java.util.*;

public class InvertedHalfPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();

        for (int i = 1; i <= rowNum; i++) {

            for (int j = 1; j <= rowNum - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

