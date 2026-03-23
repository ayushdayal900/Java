package Linkedlist;

public class LinkedListRevision2 {

    public static Node head;

    public static class Node {
        Node next;
        int data;
        Node(int data){
            this.next = null;
            this.data = data;
        }
    }


    public static boolean isCycle(){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null  ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void rmCycle(){

        
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(!cycle){
            return;
        }

        slow = head;
        Node prev = null;

        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;

    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;

        head.next.next = new Node(3);
        head.next.next.next = temp;

        // 1 -> 2 -> 3 -> 2

        System.out.println(isCycle());
        rmCycle();
        System.out.println(isCycle());


    }    
}
