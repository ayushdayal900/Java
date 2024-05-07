
// linear search in array
package ARRAYS;

import java.util.*;

public class LinearSearch {

    public static int linearSearch(int aray[], int key) {

        for (int i = 0; i < aray.length; i++) {
            if (aray[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int aray[] = { 1, 2, 20, 39, 82, 10, 28 };
        int key = 39;

        int index = linearSearch(aray, key);

        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key present at index : : " + index);
        }

    }
}


