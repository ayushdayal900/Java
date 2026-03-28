package ARRAY_LIST;

import java.util.*;

/**
 * practice
 */
public class PairSum {


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

    public static boolean pairSum1Opt(ArrayList<Integer> al, int target){

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

    public static boolean pairSum2(AbstractList<Integer> al, int target){
        int bp = -1;
        
        for(int i=0; i<al.size()-1; i++){
            if(al.get(i) > al.get(i+1)){
                bp = i;
                break;
            }
        }
        
        int si = bp+1;
        int ei = bp;
        
        int n = al.size();

        while(si != ei){

            int currSum = al.get(si) + al.get(ei);

            if(currSum == target){
                return true;
            }

            if(currSum < target){
                si = (si+1)%n;
            }else{
                ei = (n + ei -1)%n;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        // al.add( 1);         al.add(2);
        // al.add(3);          al.add(4);
        // al.add(5);

        int target = 16;


        // System.out.println(pairSum1Opt(al, target));
        
        
        // al = new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);
        
        System.out.println(pairSum2(al, target));
        
        
        
    }
}