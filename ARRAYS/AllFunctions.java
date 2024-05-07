package ARRAYS;

import java.util.*;

public class AllFunctions {

    public static void main(String[] args) {

        Integer arr1[]={1,2,3,4,5,6,7,8};
        Integer arr2[]={1,2,3,4,5};
        String  arr3[]={"a","b","c","d"};
        int arr4[]={10,20,30,40,50};
        int arr5[]={10,20,30,40,50,60};

        int arr6[]={7,2,-4,-9,100};

        int mat1[][]={{1,2,3}};
        int mat2[][]={{1,2,3},{4,5,6}};

        
        //---------------- MAKE LIST OF ARRAY-------------------------------
        List<Integer> list1 =Arrays.asList(arr1);
        List<String> list3 =Arrays.asList(arr3);

        //---------------- PRINT LIST----------------------------
        System.out.println("print a list : "+list1);
        System.out.println("print a list : "+list3);

        //---------------- PRINT ARRAYS ----------------------------
        System.out.println("Integer Array: " + Arrays.toString(arr1)); 

        //---------------- PRINT MATRIX---------------------------
        System.out.println("Print matrix : "+Arrays.deepToString(mat2));

        //---------------- BINARY SEARCH-------------------------
        System.out.println();
        System.out.println("binary search : "+Arrays.binarySearch(arr1 , 3));
        System.out.println("binary search : "+Arrays.binarySearch(arr3 , "d"));

        //---------------- BINARY SEARCH WITH COMPARATOR ------------------
        System.out.println();
        System.out.println("binary search in subarrays : "+Arrays.binarySearch(arr1 ,2,4,3));
        System.out.println("binary search in subarrays : "+Arrays.binarySearch(arr3 ,2,3, "d"));

        //---------------- COMPARE 2 ARRAYS ---------------------
        System.out.println();
        System.out.println("comparing arrays : "+Arrays.compare(arr1,arr2));
        // 0:true       other:no of diff variales

        //---------------- COMPARE 2 ARRAYS ------------------------------
        System.out.println("compare arrays : "+ Arrays.equals(arr4, arr5));
        // return true/false;

        //---------------- COMPARE UNSIGNED ----------------------
        //case 1: arr4>arr5 : (return 1)
        //case 1: arr4=arr5 : (return 0)
        //case 1: arr4<arr5 : (return -1)
        System.out.println("Unsigned comparision : "+Arrays.compareUnsigned(arr4, arr5));

        //---------------- MAKE COPY ARRAY OF 10 LENGTH -----------------------
        System.out.println();
        System.out.println("Copy of Array: "+ Arrays.toString(Arrays.copyOf(arr4, 6))); 

        //---------------- TO COPY THE ARRAY INTO AN ARRAY OF NEW LENGTH---------------------
        System.out.println("Copy from rang Array: "+ Arrays.toString( Arrays.copyOfRange(arr4, 1, 3))); 
       
        //---------------- COMPARE MATRIX ---------------------------------
        System.out.println();
        System.out.println("Compare 2 matrices : "+Arrays.deepEquals(mat1, mat2));

        //---------------- HASHCODE OF ARRAY ----------------
        System.out.println("Hash Code of Array: "+Arrays.deepHashCode(mat1));

        //---------------- MAKE ALL ELEMENT SAME ------------------------
        Arrays.fill(arr5,0);
        System.out.println("make all wlement same : "+Arrays.toString(arr5));

        //---------------- TO GET HASHCOED OF ARRAY---------------------
        System.out.println();
        System.out.println("hash code of matrix : "+Arrays.hashCode(mat1));

        //---------------- RETURS 1ST MISMATCH INDEX---------------------
        System.out.println("The element mismatched at index: "+ Arrays.mismatch(arr1,arr2)); 

        //---------------- PARALLEL SORT -------------------------
        // Arrays.parallelSort(arr6); 
        System.out.println(Arrays.toString(arr6));

        //---------------- NORMAL SORT-------------------------
        // Arrays.sort(arr6); 
        // System.out.println(Arrays.toString(arr6));
        
        // -------------- NORMAL SORT-------------------------
        Arrays.sort(arr6, 1, 4); 
        System.out.println(Arrays.toString(arr6));

        //RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
        // Arrays.sort(T[] a, int fromIndex, int toIndex, Comparator< super T> c);
        // Arrays.sort(T[] a, Comparator< super T> c);

        //---------------- SPLITERATOR FUNCTION -------------------
        System.out.println(Arrays.spliterator(arr1));
        System.out.println(Arrays.spliterator(mat2));

        //---------------- STREAM FUNCTION -----------------------
        System.out.println(Arrays.stream(arr1));

        //---------------- TO STRING ----------------------------
        System.out.println(Arrays.toString(arr1));




        



        

        
    }
}