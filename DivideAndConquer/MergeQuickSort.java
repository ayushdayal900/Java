import java.util.*;
public class MergeQuickSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
       //kam

       int mid = si+(ei-si)/2;

       mergeSort(arr, si, mid);//left
       mergeSort(arr, mid+1, ei);//right
       merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int [si=ei];
        int i = si; //left iterator
        int j = mid+1; //right iterator
        int k = 0;//iterator on temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++; 
            }
            else{
                temp[k]=arr[j];
                j++; 
            }
            k++;
        }

        // lefft part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to original array
        for(i=0, k=0; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,3,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}