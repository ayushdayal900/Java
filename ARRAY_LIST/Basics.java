

// basics of an array list

package ARRAY_LIST;


import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class Basics {
    public static void main(String[] args) {
        
        ArrayList<Integer> list_int= new ArrayList<>();
        ArrayList<String>  list_str= new ArrayList<>();
        ArrayList<Boolean> list_bol= new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();

//----------------add operation O(1)
        list_int.add(1);    list_int.add(2);
        list_int.add(3);    list_int.add(4);
        list_int.add(5);    list_int.add(6);
        n.add(100);
        n.add(200);
        
//---------------get operation O(1)   
        System.out.println(list_int.get(2)); 
        System.out.println(n.get(0));

//--------------remove operation O(n)
        list_int.remove(2); 
        n.remove(0);
        System.out.println(n.get(0));
        
//--------------set operation O(n)
        list_int.set(2,10); 
        n.set(0,100);
        System.out.println(n.get(0));

//--------------contains operation O(n)
        System.out.println(list_int.contains(2));
        System.out.println(n.contains(200));

//--------------add at specific index O(n)
        list_int.add(0,10);
        n.add(1,200);
        System.out.println(n.get(1));

//--------------size of arraylist O(n)
        System.out.println(list_int.size());
        System.out.println(n.size());

//-------------- print arraylist
        System.out.print("[");
        for(int i=0; i<list_int.size(); i++){
            System.out.print(list_int.get(i)+", ");
        }
        System.out.println("]");

        System.out.print("[");
        for(int i=0; i<n.size(); i++){
                System.out.print(n.get(i)+", ");
        }
        System.out.print("]");
        System.out.println();

       System.out.println(list_int);

    }
}
