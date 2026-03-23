package Heaps;

import java.util.ArrayList;

import ARRAY_LIST.practice;

public class InsertInHeap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
        
        public void add(int data){
            //add at last index
            arr.add(data);
            int x = (arr.size() - 1);   //x is child index
            int par = (x-1)/2;      //par is parent index

            while(arr.get(x)<arr.get(par)){
                //swap
                int t = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par, t);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}


// 