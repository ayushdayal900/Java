package BinarySearchTree;

import java.util.ArrayList;

// import ARRAY_LIST.practice;

public class MirrorBst {
    static public class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    

    


    

    

    public static Node mirror(Node root){
        if(root == null) {
            return null;
        }
        Node lefts = mirror(root.left);
        Node rights =mirror(root.right);

        root.left = rights;
        root.right =lefts;
        return root;
    }
    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        // System.out.println(mirror(root));
        preOrder(root);
        System.out.println();
        root = mirror(root);
        preOrder(root);
        

    }
}
