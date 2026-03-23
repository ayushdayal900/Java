package Linkedlist;
import java.util.LinkedList;

public class LL_JCF_Revision {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);

        ll.addFirst(0);
        ll.addFirst(-1);

        System.out.println(ll);
        
        ll.removeLast();
        System.out.println(ll);
        
        ll.removeFirst();
        System.out.println(ll);


        


    }
}
