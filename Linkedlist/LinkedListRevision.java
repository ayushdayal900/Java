package Linkedlist;

public class LinkedListRevision{

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    //---------------- functions -------------------//
        // -----------AddFirst ---------
        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            
            newNode.next = head;
            head = newNode;
        }
        
        // -----------AddLast ---------
        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        
        // ----------- PrintLL ---------
        public void printLL(){
            Node temp = head;
            if(head == null){
                System.out.println("LL is empty");
                return;
            }
            while(temp!= null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
        // ----------- AddInMiddle ---------
        public void addMiddle(int indx,int data){
            int i = 0;
            Node prev = head;
            
            if(indx == 0){
                addFirst(data);
                return;
            }
            
            while(i <indx-1){
                prev = prev.next;
                i++;
            }
            
            Node newNode = new Node(data);
            size++;
            newNode.next = prev.next;
            prev.next = newNode; 
        }

        // ----------- RemoveFirst ---------
        public int removeFirst(){
            int val = 0;
            if(size == 0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size == 1){
                val = head.data;
                head = tail =  null; 
                size = 0;   
                return val;
            }
            val = head.data;
            head = head.next;
            size--;
            return val;    
        }
        
        // ----------- RemoveLast ---------
        public int removeLast(){
            int val = 0;
            if(size == 0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            
            else if(size == 1){
                val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            
            Node prev = head;
            for(int i = 0; i<size-2; i++){
                prev = prev.next;
            }
            
            val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
        
        // ----------- iterative search ---------
        public int search_itr(int data){
            int i = 0;
            Node temp = head;
            while(temp != null){
                if(temp.data == data){
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
        
        // ----------- recursive search ---------
        
        public int helper(Node head, int key){
            if(head == null){
                return -1;
            }
            if(head.data == key){
                return 0;
            }
            int indx = helper(head.next, key);
            if(indx == -1){
                return -1;
            }
            return indx+1;
        }
        public int search_rec(int key){
            return helper(head,key);
        }
        
        // ----------- reverse a linked list ---------
        public void reverseLL(){
            Node prev = null;
            Node curr = tail = head;
            Node next;
            
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        
        // ----------- remove nth node from end ---------
        // nth node from end = (size-n+1)th node from start
        public void deleteNthNodeFromEnd(int n){
            int sz = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }

            if(sz == n){
                removeFirst();
            }

            int prev_indx = sz - n;
            int i = 1;
            Node prev = head;
            while(i<prev_indx){
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return;
        }

    // slow - fast approach : finding mid node
        public Node midNode(Node head){
            if(head == null){
                return null;
            }
            Node slow = head;
            Node fast = head;


            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    
        public boolean checkPalindrome(){

            if(head == null || head.next == null){
                return true;
            }

            // step 1 : find mid
            Node mid = midNode(head);

            // step 2 : reverse 2nd half
            Node prev = null;
            Node curr = mid;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;  // right half head
            Node left = head;   // left half head

            // step 3 : check left and right half
            while(right != null){
                if(right.data != left.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }

            return true;
        }
    
        
        
        
    public static void main(String[] args){
        LinkedListRevision ll = new LinkedListRevision();
        
        ll.printLL();
        
        ll.addFirst(10);
        ll.printLL();
        
        ll.addFirst(00);
        ll.printLL();
        
        ll.addLast(20);
        ll.printLL();
        
        ll.addLast(30);
        ll.printLL();
        
        ll.addMiddle(2, 99);
        ll.printLL();
        
        System.out.println(ll.size);
        
        ll.removeFirst();
        ll.printLL();
        
        ll.removeLast();
        ll.printLL();
        
        int indx1 = ll.search_itr(9);
        System.out.println(indx1);
        
        int indx2 = ll.search_rec(99);
        System.out.println(indx2);

        ll.printLL();
        ll.reverseLL();
        ll.printLL();

        ll.deleteNthNodeFromEnd(2);
        ll.printLL(); // 20 -> 10 -> null

        ll.addLast(10);
        ll.addLast(20);
        ll.printLL();
        
        System.out.println(ll.checkPalindrome());
        ll.addLast(20);
        System.out.println(l                     l.checkPalindrome());




    }
}
