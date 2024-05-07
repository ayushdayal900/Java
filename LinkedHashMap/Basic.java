package LinkedHashMap;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",150);
        lhm.put("China",140);
        lhm.put("US",10);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",150);
        hm.put("China",140);
        hm.put("US",10);

        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",150);
        tm.put("China",140);
        tm.put("US",10);


        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);
    }
}
