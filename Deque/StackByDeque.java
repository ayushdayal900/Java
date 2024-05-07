package Deque;
import java.util.*;

public class StackByDeque {
    static class Stack {
        Deque<Integer> d = new LinkedList<>();
        
        //push
        public void push(int data){
            d.addLast(data);
        }

        //pop
        public int pop(){
            return d.removeLast();
        }

        //peek
        public int peek(){
            return d.getLast();
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);      s.push(1);
        s.push(2);      s.push(3);
        s.push(4);      s.push(5);

        System.out.println("peek : "+s.peek());

        System.out.println(s.pop());        System.out.println(s.pop());
        System.out.println(s.pop());        System.out.println(s.pop());
        System.out.println(s.pop());        System.out.println(s.pop());

        System.out.println(s);
        
    }
    
}
