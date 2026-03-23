package BinarySearchTree;

import java.util.ArrayList;

import ARRAY_LIST.practice;
import Loops.for_100_times_hello_world;

public class PrintRootToLeafPath {

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


    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data  > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static void printPath(ArrayList<Integer> al){
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+"-");
        }
        System.out.println("Null");
    }


    public static void printRootToLeafPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }

        printRootToLeafPath(root.left, path);
        printRootToLeafPath(root.right, path);
        path.remove(path.size() - 1);

    }
    public static void main(String[] args) {
        int[] values = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        printRootToLeafPath(root,new ArrayList<>());

    }
    }

