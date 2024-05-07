

// sorting of an array list

package ARRAY_LIST;

import java.util.ArrayList;
import java.util.Collections;

public class SortAL {

     public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();
        l.add(3);       l.add(9);
        l.add(1);       l.add(2);

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);

        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        arr.add(1);         arr.add(2);
        arr.add(3);         arr.add(4);
        arr.add(5);         arr.add(6);


        arr1.add(1);         arr1.add(2);
        arr1.add(3);         arr1.add(4);
        arr1.add(5);         arr1.add(6);
        arr1.add(7);         arr1.add(8);

        System.out.println(arr);
        list.add(arr);
        System.out.println(list);
        list.add(arr1);
        System.out.println(list);

        ArrayList<Integer> sepL = new ArrayList<>();

        for(int i=0; i<list.size(); i++){
            sepL = list.get(i);
            for(int j=0; j<sepL.size(); j++){
                System.out.print(sepL.get(j) +" ");
            }
        }

       // System.out.println(sepL);
      
     }
    
}
