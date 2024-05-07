package HashSet;

import java.util.HashSet;

public class Union_Interctn {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        int intsce_count =0;
        int union_count =0;

        HashSet<Integer> hs = new HashSet<>();
        /////// union ////////////
        for(int i:arr1){
            hs.add(i);
        }
        for(int i:arr2){
            hs.add(i);
        }
        System.out.println("Union : "+hs);        
        
        /// intercetion ////
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i:arr2){
            hs1.add(i);
        }
        for(int i: arr1){
            if(hs1.contains(i)){
                intsce_count++;
                System.out.println(hs1.remove(i)); 
            }
        }

        union_count = hs.size();
        System.out.println("union : "+union_count);
        System.out.println("intersection : "+intsce_count);
        

    }
    
}
