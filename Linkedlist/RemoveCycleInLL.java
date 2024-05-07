import java.util.*;

public class RemoveCycleInLL {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    public static boolean rmvCycle(){


        return true;


    }

    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next = head;

        
    }


    
}
