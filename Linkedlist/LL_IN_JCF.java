import java.util.LinkedList;

public class LL_IN_JCF {


    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void zigzag(){

        // find mid 
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;
        
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL ,nextR;

        //alt merge -zig zag merge
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR  =right.next;
            right.next=nextL;

            //update
            next = nextL;
            right = nextR;
        }
    }






    public static void main(String[] args) {
        
        // create a linked list
        LinkedList<Integer> ll = new LinkedList<>();

        // add in linked list
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.add(3);  // add at last position..............
        
        //print a linked list
        System.out.println(ll);

        // remove from linked list
        ll.removeLast();
        ll.removeFirst();
        ll.remove();    // remove from 1st position
        ll.removeAll(ll);

        System.out.println(ll);

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println(ll);
        ll.zigzag();    //RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
        System.out.println(ll);
    }

}
