//Q1. reverse a string by using a stack

import java.util.*;

public class StackRevString {

    public static String reverseString(String str){
        Stack<Character> c = new Stack<Character>();
        
        for(int i=0; i<str.length(); i++){
            c.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder("");
        
        while(!c.isEmpty()){
            char curr = c.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Ayush Prashant Dayal";
        String rev = reverseString(str);

        System.out.println(rev);
        
    }
    
}
