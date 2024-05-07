package HashSet;

import java.util.HashSet;
import java.util.*;



public class Basics {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);  hs.add(2); 
        hs.add(3);  hs.add(4); 
        hs.add(5);  hs.add(6); 
        hs.add(1);

        System.out.println(hs);
        
        System.out.println(hs.contains(1));
        System.out.println(hs.contains(10));
        System.out.println(hs.size()==6);
        
        hs.remove(4);
        System.out.println(hs);
        System.out.println(hs.contains(4));
        System.out.println(hs);
        
        hs.clear();
        System.out.println(hs);

        /////////////////////// iterators /////////////////////
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");   cities.add("Dhule");   
        cities.add("Pune");     cities.add("Yawatmal");   
        cities.add("Nagpur");   cities.add("Akola");   

        Iterator<String> it = cities.iterator();
        System.out.println("Cities Name : ");
        while(it.hasNext()){System.out.println(it.next());}
        
        ////////////// Advanced for lopp /////////////////////
        for(String s:cities){
            System.out.println(s);
        }

        
        



    }
}