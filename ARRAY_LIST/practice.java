package ARRAY_LIST;

import java.util.*;

/**
 * practice
 */
public class practice {


    public static boolean pairSum1(ArrayList<Integer> al, int target){

        for(int i=0; i<al.size(); i++){
            for(int j=i+1; j<al.size(); j++){
                if(al.get(i) + al.get(j) == target){
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean pairSum2(ArrayList<Integer> al, int target){

        int si = 0;
        int ei = al.size() - 1;

        while(si < ei){
            int currSum = al.get(si) + al.get(ei);
            if( currSum == target){
                return true;
            }
            else if(currSum < target){
                si++;
            }else{
                ei--;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add( 1);         al.add(2);
        al.add(3);          al.add(4);
        al.add(5);

        int target = 5;


        System.out.println(pairSum1(al, target));
        
    }
}