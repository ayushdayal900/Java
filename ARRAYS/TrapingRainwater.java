
// imp trapping of rain water

package ARRAYS;
import java.util.*;

public class TrapingRainwater {

    public static int calculateWater(int height[]){

        int water=0;
        int currWater=0;
        int lm[]=new int[height.length];
        int rm[]=new int[height.length];
        lm[0]=height[0];
        rm[height.length-1]=height[height.length-1];


        //left maxm
        for(int i=1; i<height.length; i++){
            if(height[i]>lm[i-1]){
                lm[i]=height[i];
            }
            else{
                lm[i]=lm[i-1];
            }

        }

        //right maxm
        for(int i=(height.length-2); i>=0; i--){
            if(height[i]>rm[i+1]){
                rm[i]=height[i];
            }
            else{
                rm[i]=rm[i+1];
            }
        }

        for(int i=0; i<height.length; i++){
            currWater=Math.min(rm[i],lm[i])-height[i];
            water+=currWater;
        }



        return water;
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];

        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        System.out.println(calculateWater(array));

    }
    
}
