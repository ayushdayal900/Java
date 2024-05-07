import java.util.*;

/**
 * CycleInLinkedList
 */
public class isCycleInLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
//--------------------------------- check cycle -------------------------------
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

//-------------------------------- remove cycle -------------------------------
    public static void rmvCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
                if(fast==slow){
                    cycle=true;
                    break;
                }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;

        while(slow!=fast){
            slow= slow.next;
            prev = fast; 
            fast = fast.next;
        }

        //remove cycle  -> last.next=null
        prev.next=null;
    }

    public static void main(String[] args) {
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head; //1->2->3->1

        head = new Node(1);
        Node temp =new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; 
        //1->2->3->2

        System.out.println("is cycle exist = "+isCycle());
        rmvCycle();
        System.out.println("is cycle exst = "+isCycle());

        

    }
}