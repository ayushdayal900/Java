package HashMap;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        //Creating a HashMap
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert O(1)
        hm.put("India" ,100);       hm.put("China" ,90);
        hm.put("Nepal" ,30);       hm.put("US" ,10);

        System.out.println(hm);

        //get   O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("india"));
        
        //contains O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("india"));

        //remove O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());

//----------------------------------------------------------------------------------------------------

        hm.put("India" ,100);      hm.put("China" ,90);
        hm.put("Nepal" ,30);       hm.put("US" ,10);
        hm.put("Indonesia" ,10);   hm.put("Itly" ,20);
        hm.put("Nepal" ,30);       hm.put("London" ,40);


        //Iterate  - set
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = " +k + ", value = "+hm.get(k));
        }

        //Iterate  - entrySet
        Set<String> keys1 = hm.keySet();
        System.out.println(keys1);
        System.out.println("Key, Value = "+hm.entrySet());
        


    }    
}
