
// make triplet

package ARRAYS;

import java.util.Scanner;

public class MakeTriplets {

    public static void triples(int a[]) {
        // int arr[]={-1, 0,1,-1,-4};

        for (int i = 0; i < a.length-2; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int k = i+2; k < a.length; k++) {

                    if ((i != j) && (i != k) && (j != k) && (a[i]!=a[j]) && ((a[i] + a[j] + a[k]) == 0)) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);

                    }

                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        triples(array);
    }

}
