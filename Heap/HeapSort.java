import java.util.*;


public class HeapSort {

    public static void heapify(int arr[], int i, int size){
        int l = 2*i+1;
        int r = 2*i+2;
        int maxIndex = i;

        if(l<size && arr[maxIndex]<arr[l]){
            maxIndex = l;
        }
        if(r<size && arr[maxIndex]<arr[r]){
            maxIndex = r;
        }

        if(maxIndex != i){
            // swap
            int t = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = t;

            heapify(arr, maxIndex, size);
        }
    }

    public static void heapSort(int arr[]){
        // step1 - build maxHeap
        int n = arr.length;

            // 1st non leaf node at n/2-1
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, i,n);
        }

        // step2 - push largest at end
        for(int i=n-1; i>0;i--){
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }



    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        heapSort(arr);

        // print()
        for(int i : arr){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}
