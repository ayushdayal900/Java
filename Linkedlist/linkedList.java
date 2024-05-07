import java.util.*;
public class linkedList {
    //node class
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //head and tail as properties of linkedList
    public static Node head;
    public static Node tail;
    public static int size;

    //add first in linkedList
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last in linkedList
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //print linkedList
    public static void print() {
        if(head == null ) {
            System.out.println("LinkedList is empty!");
        }
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add in middle
    public static void add(int idx , int data) {
        //if likedList is empty
        if(head == null) {
        addFirst(data);
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1) {
            temp = temp.next;
            i++;
        }
        //now i=idx-1 ; temp-->prevNode
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //remove first node of linkedlist
    public static int removeFirst() {
        //if linkedlist is empty
        if(head == null) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        //if linkedlist have only one node
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

    //remove last node of linkedlist
    public static int removeLast() {
        //if linkedlist is empty
        if(head == null) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        //if linkedlist have only one node
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //in all other cases
        Node prev = head;
        //i = size-2
        for(int i=0 ; i<size-2 ; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Iterative search in Linked List
    public static int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //recursive search in linked list
    public static int helper(Node head , int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public static int recursiveSearch(int key) {
        return helper(head , key);
    }

    //reverse a linkedlist
    public static void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //delete nth node from last
    public static void deleteNthNodeFromEnd(int n) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        //to delete head node
        if(n == size) {
            head = head.next; //remove first
            return;
        }

        int i=1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //to check if linkedlist is palindrome
    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        //find mid
        Node mid = findMidNode(head);
        //reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //head of reversed right half
        Node left = head;
        //check if left half == right half
        while(right!=null) {
            if(right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //to check if cycle or loop exists in linkedlist
    public boolean isCycle() {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;//+2
            slow = slow.next;//+1
            if(slow == fast) {
                return true;//cycle exists
            }
        }
        return false;//cycle doesn't exists
    }

    //to remove cycle from linkedlist
    public void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        //finding meeting point
        slow = head;
        Node prev = null;//last node
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle :- last.next->null
        prev.next = null;
    }

    //implementing merge sort on linkedlist
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//returning mid
    }
    private Node merge(Node head1 , Node head2) {
        Node merged = new Node(-1);
        Node temp = merged;
        while(head1!=null && head2!=null) {
            if(head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!=null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }
    public Node mergeSort(Node head) {
        if(head==null || head.next==null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        //call merge sort for left and right
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge left and right half
        return merge(newLeft , newRight);
    }

    //making zig-zag linkedlist
    public void zigZag(Node head) {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;

        //alternate merging
        Node leftHead = head;
        Node nextL , nextR;
        while(leftHead!=null && rightHead!=null) {
            //zigzag merging
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;
            //updating variables
            rightHead = nextR;
            leftHead = nextL;
        }
    }

    //search intersection node of two linked list in Y shape
    public Node getIntersection(Node head1 , Node head2) {
        while(head2!=null) {
            Node temp = head1;
            while(temp!=null) {
                if(temp==head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    //delete n nodes after every m nodes eg. 1-2-3-4-5-6  -> 1-2-5-6
    public void removeNextN(Node start , int n) {
        if(start==null) {
            return;
        }
        Node prev = start;
        Node curr = prev.next;
        Node next;
        int i=0;
        while(i<n) {
            next = curr.next;
            prev.next = next;
            curr = next;
            i++;
        }
    }
    public void deleteNafterM(int m , int n) { 
        if(m==0 && n==0) {
            return;
        }
        if(m==0) {
            Node demo = head;
            while(demo != null) {
                removeFirst();
            }
            return;
        }
        Node temp = head;
        int i = 1;
        while(temp!=null) {
            if(i==m) {
                removeNextN(temp , n);
                i=0;
            }
            i++;
            temp = temp.next;
        }
    }


    public static void main(String args[]) {
        linkedList l1 = new linkedList();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(2);
        l1.addLast(1);
        print();
        System.out.println("size of likedlist = " + l1.size);

        // l1.removeLast();
        // print();
        // l1.removeFirst();
        // print();

        // System.out.println(l1.iterativeSearch(3));
        // System.out.println(l1.iterativeSearch(10));
        // System.out.println(l1.recursiveSearch(4));

        // l1.reverse();
        // l1.print();

        // l1.deleteNthNodeFromEnd(3);
        // l1.print();

        //System.out.println(l1.checkPalindrome());

        // linkedList l2 = new linkedList();
        // l2.head = new Node(1);
        // l2.head.next = new Node(2);
        // l2.head.next.next = new Node(3);
        // l2.head.next.next.next = new Node(4);
        // l2.head.next.next.next.next = l2.head.next;
        // System.out.println(l2.isCycle());
        // l2.removeCycle();
        // System.out.println(l2.isCycle());

        // linkedList l3 = new linkedList();
        // l3.addLast(1);
        // l3.addLast(2);
        // l3.addLast(3);
        // l3.addLast(4);
        // l3.addLast(5);
        // //l3.addLast(6);
        // l3.print();
        // //l3.mergeSort(l3.head);

        // l3.zigZag(l3.head);
        // l3.print();

        //Que. find intersection
        // linkedList l4 = new linkedList();
        // Node head1, head2;
        // head1 = new Node(10);
        // head2 = new Node(3);
        // Node newNode = new Node(6);
        // head2.next = newNode;
        // newNode = new Node(9);
        // head2.next.next = newNode;
        // newNode = new Node(15);
        // head1.next = newNode;
        // head2.next.next.next = newNode;
        // newNode = new Node(30);
        // head1.next.next = newNode;
        // head1.next.next.next = null;
        // Node intersectionPoint = l4.getIntersection(head1, head2);
        // if (intersectionPoint == null) {
        //     System.out.print(" No Intersection Point \n");
        // }
        // else {
        // System.out.print("Intersection Point: " + intersectionPoint.data);
        // }

        //Que remove n nodes after every m nodes
        // // linkedList l4 = new linkedList();
        // l4.addLast(1);
        // l4.addLast(2);
        // l4.addLast(3);
        // l4.addLast(4);
        // l4.addLast(5);
        // l4.addLast(6);
        // l4.print();
        // l4.deleteNafterM(2 , 2);
        // l4.print();
    }
}
