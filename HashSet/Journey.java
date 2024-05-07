package HashSet;

import java.util.HashMap;

public class Journey {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> rev_tickets = new HashMap<>();
        for(String key:tickets.keySet()){
            rev_tickets.put(tickets.get(key),key);
        }

        for(String key : tickets.keySet()){
            if(!rev_tickets.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {

        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("C","B");
        tickets.put("M","D");
        tickets.put("G","C");
        tickets.put("D","G");

        // System.out.println(getStart(tickets));
        String start = getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){
            System.out.print("--> "+tickets.get(start));
            start = tickets.get(start);
        }



    }
}
