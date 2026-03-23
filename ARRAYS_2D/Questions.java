package ARRAYS_2D;

import java.util.*;

public class Questions {

    // --------------------------------------q1

    public static int no_of_7(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    // ----------------------------------------q2-----------------------
    public static int sum_2nd_row(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[1][i];
        }
        return sum;
    }

    // ---------------------------------------------q3--------------------
    public static void trans(int matrix[][], int n) {
        // int temp;
        int m = matrix[0].length;
        int temp[][] = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp[j][i] = matrix[i][j];
                // matrix[i][j] = matrix[j][i];
                // matrix[j][i] = temp[i][j];
            }
            //System.out.println();
        }
        // for (int i = 0; i < temp.length; i++) {
        //     for (int j = 0; j < temp.length; j++) {
        //         matrix[i][j] = temp[j][i];
        //     }
        // }

        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp[0].length; j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();

        }

    }
    // --------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // --------Q1] no of 7's in array--------
        System.out.println(no_of_7(matrix));

        // --------Q2] sum of 2nd row elements--------
        System.out.println(sum_2nd_row(matrix));

        // --------Q3] transpose of a matrix-------------
        // System.out.println(trans(matrix));

        trans(matrix, n);

    }

}
