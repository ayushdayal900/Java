// //Q binary search programme

// package ARRAYS;

// import java.util.*;

// public class BinarySearch {
//     public static int binarySearch(int a[], int key) {

//         int start = 0;
//         int end = a.length - 1;

//         while (start <= end) {

//             int mid = (start + end) / 2;
//             if (a[mid] == key) {
//                 return mid;
//             }
//             if (a[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {

//         int aray[] = { 1, 2, 3, 4, 5, 6, 10 };
//         int key = 3000;
//         int index = binarySearch(aray, key);

//         System.out.println("key at index : " + index);
//     }

// }


package ARRAYS;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static int binSearch(int a[], int key){

        int start =0;
        int end = a.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(key==a[mid]){
                return mid;
            }
            if(key>mid){
                start = mid+1;
                
            }
            else{
                end = mid -1;
            }
        }
            return -1;

    }


    public static void main(String[] args) {

        int ar[]={1,2,3,4,5};
        int key =4;
        int index = binSearch(ar, key);
        System.out.println(index);
        
    }
}