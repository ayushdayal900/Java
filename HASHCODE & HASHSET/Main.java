// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args ) {
        //HASHSET. Simple Wala, only one 'data type' holder. Can be any data type.
        //By any, I mean char -> Character. int -> Integer. This is for all types of sets and hashies :)
        //HASHMAP. Khatarnak wala, holds 'two' data type.


        //HASHSET
        HashSet<Integer> hashy1 = new HashSet<>();

        hashy1.add(2); //adds a value
        hashy1.remove(2); //removes a value
        hashy1.size(); //gives the size of hashy.
        hashy1.contains(3); //returns if a value is in hashy, true of false
        hashy1.clear(); //clear hashy
        hashy1.clone(); //clone

        Integer[] arr = new Integer[hashy1.size()];
        hashy1.toArray(arr); //directly hashy to arr.



        //HASHMAP
        HashMap<Character, Integer> hashy2 = new HashMap<>();

        //Character (First data type) -> KEY    Integer (Second data type) -> KEY VALUE.

        hashy2.containsKey('e'); //return true or false
        hashy2.clear(); //clear
        hashy2.remove('3'); //removes element of first data type (key)
        hashy2.clone(); //clone

        hashy2.put( 'a', hashy2.getOrDefault('a', 0)); //SUPER IMP HASHMAP FUNCTION, KINDA HARD TOO.
        //'a' = character a.... Then after comma, we are getting the integer value beside 'a' in HashMap. 
        // so GETorDEFAULT integervalue of 'a'. Get is simple, it means getting.
        // OR default means, if 'a' is not found in the hashy, it will take the integer value beside it as 0.
        // This put function only works for HashMap<data type, integer> you will need this in most cases.
        hashy2.replace('e', 4); //put the integer value along side 'e' as 4, irrespective of what it is.
        hashy2.size(); //size

    }
}