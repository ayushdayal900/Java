package GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int coniCount=0;
        int amount = 1590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(amount>=coins[i]){
                while (amount>=coins[i]) {
                    coniCount++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }

        System.out.println(ans);
        System.out.println(coniCount);
        // System.out.println();


    }
}
