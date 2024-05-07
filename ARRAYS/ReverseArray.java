

// to revers an array 

package ARRAYS;

public class ReverseArray {

    public static void revArray(int number[]) {
        int start = 0;
        int last = number.length - 1;

        while (start < last) {
            int tmp = number[last];
            number[last] = number[start];
            number[start] = tmp;

            start++;
            last--;
        }

    }

    public static void main(String[] args) {

        int aray[] = { 2, 4, 6, 8, 10 };
        revArray(aray);

        for (int i = 0; i < aray.length - 1; i++) {
            System.out.print(aray[i] + " ");
        }

    }
}
