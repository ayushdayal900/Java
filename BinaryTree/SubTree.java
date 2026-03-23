package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SubTree {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot){
        if(node==null && subRoot == null){
            return true;
        }else if(node==null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        // left subtree non identical
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        // right subtree non identical
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;

    }

    public static boolean isSubtree(Node root, Node subRoot){ //true-> 

        if(root==null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;  
            }
        }

        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root.right, subRoot);

        return (leftAns || rightAns);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
        
    }

    public static void topView(Node root){
        //level order traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min =0;
        int max =0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }

            if(map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left != null){
                q.add(new Info(curr.node.left, curr.hd -1));
                min = Math.min(min, curr.hd-1);
            }

            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd -1));
                max = Math.max(max, curr.hd+1);
            }
        }

        for(int i=min; i<=max; i++){
            System.out.println(map.get(i));
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.right.left = new Node(6);
        root.right.right= new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Is subtree? : "+isSubtree(root, subRoot));
        System.out.println("Is subtree? : "+isSubtree(root, subRoot));

    }


}
