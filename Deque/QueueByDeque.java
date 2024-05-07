package Deque;
import java.util.*;

public class QueueByDeque {
    static class Queue {
        
        static Deque<Integer> d = new LinkedList<>();

        //add
        public static void add(int data){
            d.addLast(data);
        }    
        
        //remove
        public static int remove(){
            return d.removeFirst();
        }

        // peek
        public static int peek(){
            return d.getFirst();
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(0);       q.add(1);
        q.add(2);       q.add(3);
        q.add(4);       q.add(5);

        System.out.println("peek : "+q.peek());

        System.out.println(q.remove());     System.out.println(q.remove());
        System.out.println(q.remove());     System.out.println(q.remove());
        System.out.println(q.remove());     System.out.println(q.remove());
        
    }
    
}
