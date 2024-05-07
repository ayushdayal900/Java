import java.util.*;
public class MaxmArea {

    public static void MaxmArea(int heights[]){ //O(n) - optimized
        int maxArea =0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=heights.length-1; i>0; i--){
            //while
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }

            // if -else
            if(s.isEmpty()){
                nsr[i]=heights.length;
            }
            else{
                nsr[i]=s.peek();
            }
            // push
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();

        for(int i=0; i<heights.length; i++){
            //while
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }

            // if -else
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }

            // push
            s.push(i);
        }



        //current area widht = j-i-1
        // width = nsr[i]-nsl[i]-1
        for(int i=0; i<heights.length; i++){
            int ht = heights[i];
            int wd = nsr[i]-nsl[i]-1;
            int currArea = ht*wd;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("maximum area in histogram " +maxArea);

    }


    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        int heights1[] = {2,4};
        MaxmArea(heights1);
    }    
}
