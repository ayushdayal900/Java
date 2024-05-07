import java.util.*;

public class ValidBrackets {

    public static boolean isValid(String str) {
        Stack<Character> c = new Stack<>();

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                //opening
                c.push(ch);
            }

            else{
                //closing
                if(c.isEmpty()){
                    return false;
                }
                if((c.peek()== '(' && ch==')') || c.peek()== '{' && ch=='}'||c.peek()== '[' && ch==']'){
                    c.pop();
                }
                else{
                    return false;
                }
                

            }
        }

        if(c.isEmpty()){
            return true;
        }
        else{
            return false;
        }
       
    }


    public static void main(String[] args) {
        String str = "({})[]{";  //true
        System.out.println(isValid(str));
        
    }    
}
