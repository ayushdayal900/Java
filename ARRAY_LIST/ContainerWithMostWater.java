
// container with most of water problem
package ARRAY_LIST;

import java.util.*;

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;

        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int l = Math.min(height.get(i), height.get(j));
                int b = j-i;
                int currWater = l*b;

                maxWater = Math.max(maxWater, currWater);
            }

        }
        return maxWater;
    }

    public static int storeWaterByPointers(ArrayList<Integer> height){

        int lp = 0;
        int rp = height.size()-1;
        int l=0, b=0;
        int currWater = 0;
        int maxWater =0;


        while(lp<rp){

            l = Math.min(height.get(lp), height.get(rp));
            b = rp-lp;
            currWater=l*b;
            maxWater = Math.max(maxWater,currWater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }



        return maxWater;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1); heights.add(8);
        heights.add(6); heights.add(2);
        heights.add(5); heights.add(4);
        heights.add(8); heights.add(3); 
        heights.add(7);

      //----------m1-----> System.out.println(storeWater(heights)); O(n^2)
      System.out.println(storeWaterByPointers(heights));

        
        


    }
}