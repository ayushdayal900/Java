package BinaryTree;

public class KthAncestor {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){ 
            this.data = data;
            left = null;
            right= null;
        }        
    }

    public static int KAncestor(Node root, int n, int k) {
        if(root == null){return -1;}
        if(root.data == n){return 0;}
        int ld = KAncestor(root.left, n, k);
        int rd = KAncestor(root.right, n, k);
        if(ld==-1 && rd ==-1){return -1;}
        int maxm = Math.max(ld,rd);
        if(maxm+1 == k){
            System.out.println("Root data : "+root.data);
        }
        return maxm+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 4, k = 1;
        KAncestor(root,n,k);

    }
    
    
}
