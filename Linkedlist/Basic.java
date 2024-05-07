// import ARRAY_LIST.practice;

// import ARRAY_LIST.practice;
import java.util.LinkedList;

public class Basic {
    // public static class linkL{

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

    // add first in ll
    public static void addFirst(int data) {
        // s1 :- create new node
        Node newNode = new Node(data);
        size++; // increment size to get size of linked list
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // s2 :- new node's next = head
        newNode.next = head;
        // s3 :- head = new node
        head = newNode;
    }

    // add last in ll
    public void addLast(int data) {
        // s1 :- create a newNode
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // s2 :- tail.next = newNode
        tail.next = newNode;

        // s3 :- tail=newNode
        tail = newNode;
    }

    // print ll
    public void print() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            // return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // add in mid
    public static void addMid(int index, int data) {
        // s1 :- find previous

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // i = index-1 -------> temp = prev

        // newode.next = prev.next
        newNode.next = temp.next;

        // temp.next = newNode
        temp.next = newNode;

        //

    }

    // ------------------------remove 1st node------------------------------
    public static int removeFirst() {
        int val = 0;
        if (size == 0) {
            System.out.println("Linked list is empty.");
            return -1;
        } else if (size == 1) {
            val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // ---------------------------remove last
    // node------------------------------------------
    public static int removeLast() {
        int val = 0;
        int i = 0;

        if (size == 0) {
            System.out.println("LL is empty");
            return -1;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            val = head.data;
            return val;
        }
        Node prev = head;
        // prev i = size-2

        for (int m = 0; m < size - 2; m++) {
            prev = prev.next;
        }
        val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    // --------------iterative search in LL----------------------
    public static int search(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {

            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }
    // ----------------------search recusion----tc and sc = O(n)

    // public static int rec(int key, Node temp, int i){

    // if(temp.data==key){
    // return i;
    // }
    // else if(temp==null){
    // return -1;
    // }
    // return rec(key,temp.next,i+1);
    // }

    // public static int searchRec(int key){
    // Node temp = head;
    // int i=0;
    // int ans = rec(key,temp,i);
    // return ans;
    // }

    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static int searchRec(int key) {
        return helper(head, key);
    }

    // ----------------------reversing of ll------------------------------------------

    public static void reverse() {
        Node prev = null; //
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;//bec curr==null so prev==head

    }

    //-------------------------- delete nth from end ----------------------------------

    public static void delEnd(int n){

        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;//  remove first
            return;
        }

        // size-n
        int i=1;
        int iTofind=sz-n;
        Node prev = head;

        while(i<iTofind){
            prev=prev.next;
            i++;
            prev.next  = prev.next.next; 
            return;
        }
    }
    //-------------------------------------findMid---------------------------------------
        public static Node findMid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast!=null || fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;    //slowis my mid node
        }
    
    //--------------------------------checkPalindrome---------------------------------

    public static boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step1 :- find mid node
        Node midNode = findMid(head);

        //step2 :- reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr=next;
        }
        Node right = prev;  //right half head
        Node left = head;

        //step3 :- check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    //-------------------------- check cycle ---------------------------------------
        public static boolean isCycle(){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                    if(slow == fast){
                        return true;
                    }
            }
            return false;
        }
    

    //----------------------------zig zag-------------------------------

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

    // -----------------------------------------main-----------------------------------
    public static void main(String[] args) {
        // linkedList ll=new linkedList();

        Basic l = new Basic();

        l.print();
        l.addFirst(2);
        l.print();
        l.addFirst(1);
        l.print();
        l.addLast(3);
        l.print();
        l.addLast(4);
        l.print();

        addMid(0, 0);
        l.print();

        // LL 1 --> 2 --> 9 --> 1 --> 2 --> null

        // size of LL
        System.out.println(l.size);

        // rem first element 1 --> 2 --> 3 --> 4 --> null
        System.out.println("rem val = " + removeFirst());
        l.print();
        System.out.println(l.size);

        // rem last element 1 --> 2 --> 3 --> null
        System.out.println("rem val = " + removeLast());
        l.print();
        System.out.println("size = " + l.size);

        // searching in LL by iterative method
        System.out.println("found at index = " + search(1));

        // searching in LL by recursion method
        System.out.println("found at index = " + searchRec(20));

        //----------------------------reverse LL
        l.reverse();
        l.print();

        //------------------------------delete nth element
        delEnd(3);

        //---------------------------check palindrome---------------------------
        //RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
        // System.out.println(l.checkPalindrome());
        // l.print();  

        //------------------------------check cycle--------------------------------
        System.out.println("is Cycle = "+isCycle());

        l.removeFirst();
        l.removeFirst();
        l.removeFirst();

        

        System.out.println(l);


        
    }
}