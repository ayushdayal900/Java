import java.util.*;


public class DuplicateBrackets {

    public static boolean isDuplicate(String s){    // O(n)

        Stack<Character> c = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            //closing
            if(ch == ')'){
                int count =0;
                while(c.peek() != '('){
                    c.pop();
                    count++;
                }
                if(count<1){
                    return true;    //duplicate
                }
                else{
                    c.pop();    //opening pair
                }
            }
            //opening
            else{
                c.push(ch);
            }
        }

        return false;

    }

    public static void main(String[] args) {
        
        String str1= "((a+b))";
        String str2= "(a+b)";
        System.out.println(isDuplicate(str2));


    }    
}
