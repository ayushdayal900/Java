// package StackAL;
import java.util.*;

public class StackAL {
    public static class StackI{
        static ArrayList<Integer> list = new ArrayList<>();

        //is empty
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public static void push(int n){
            list.add(n);
        }

        //pop
        public static int pop(){

            //corner case
            if(isEmpty()){
                return -1;
            }

            int temp = list.get(list.size()-1);
            list.remove(temp);
            return temp;
        }

        //peek
        public static int peek(){

             //corner case
             if(isEmpty()){
                return -1;
            }

            return list.get( list.size()-1);
        }
    }

    public static void main(String[] args) {
        StackI s = new StackI();
        
        s.push(0);          s.push(1);
        s.push(2);          s.push(3);
        s.push(4);          s.push(5);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }

    }
}
